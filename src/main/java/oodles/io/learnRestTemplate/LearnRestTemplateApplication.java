package oodles.io.learnRestTemplate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import oodles.io.learnRestTemplate.modle.ChatRoomResponse;
import oodles.io.learnRestTemplate.service.Services;

@SpringBootApplication
public class LearnRestTemplateApplication {
	

	public static void main(String[] args) {
	//	SpringApplication.run(LearnRestTemplateApplication.class, args);
	Services service = new Services();
	ResponseEntity<String> response =service.useExchangeMethodsOfRestTemplate();
	System.out.println(response.getBody());
	System.out.println(response.getStatusCode());
	
	ObjectMapper objectMapper =new ObjectMapper();
	
	try {
		ChatRoomResponse chatobj = objectMapper.readValue(response.getBody(),ChatRoomResponse.class);
		System.out.println(chatobj.getData().getChatRoomId());
		
	} catch (JsonProcessingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}	
}
