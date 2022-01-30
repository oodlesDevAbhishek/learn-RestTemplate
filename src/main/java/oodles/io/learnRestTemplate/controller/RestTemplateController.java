package oodles.io.learnRestTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import oodles.io.learnRestTemplate.modle.ChatRoomResponse;
import oodles.io.learnRestTemplate.modle.Data;
import oodles.io.learnRestTemplate.repo.NewChatRoomRepository;
import oodles.io.learnRestTemplate.service.ConsumeServices;

@RestController
public class RestTemplateController {

	@Autowired
	private ConsumeServices consumeService;
	@Autowired
	private NewChatRoomRepository newChatRoomRepository;

	@RequestMapping("/api")
	ResponseEntity<?> useRestTemplate() {
		ResponseEntity<ChatRoomResponse> chatroomresponse;
		try {
			chatroomresponse = consumeService.useExchangeMethodsOfRestTemplate();
			Data newChatRoom = chatroomresponse.getBody().getData();
			newChatRoomRepository.save(newChatRoom);
			return new ResponseEntity<Data>(newChatRoom, HttpStatus.CREATED);
		}

		catch (Exception e) {
	     System.out.println(e.getMessage());
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
