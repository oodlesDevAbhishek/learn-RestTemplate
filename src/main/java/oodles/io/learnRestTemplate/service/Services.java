package oodles.io.learnRestTemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import oodles.io.learnRestTemplate.modle.ChatRoomCreationParams;
import oodles.io.learnRestTemplate.modle.ChatRoomResponse;

@Service
public class Services {

	@Autowired
	private RestTemplate restTemplate=new RestTemplate();

	public ResponseEntity<String> useExchangeMethodsOfRestTemplate() {

		ChatRoomCreationParams chatroompara = new ChatRoomCreationParams();
		chatroompara.setChatRoomName("demo__resttemp");
		List<Long> members = List.of(1001L, 2001L, 2003L);
		chatroompara.setMembers(members);

		String baseURL = "http://localhost:8080/v1/user/chat/chatRoom";
		String auth = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiLCJST0xFX0FETUlOIiwiUk9MRV9BUFBfQURNSU4iLCJST0xFX1NVUEVSQURNSU4iLCJST0xFX1NVUEVSX0FETUlOIl0sImlwIjoiMDowOjA6MDowOjA6MDoxIiwidXNlcklkIjoxMDAxLCJlbWFpbCI6ImFiaGlzaGVrLmd1cHRhMUBvb2RsZXMuaW8iLCJ1c2VybmFtZSI6IlNjYWZmb2xkIiwianRpIjoiNDYwZThlMGEtMWY1Yi00NjM3LTk3OTYtODJiMTA4NDA0OWQzIiwiZXhwIjoxNjQzNDEzMjk0LCJpc3MiOiJDb21tdW5pY2F0aW9uIFNjYWZmb2xkIn0.mqc4JI7xD1107g9coP6yKkI5l22KvFQxN0pSd4OURSc";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(auth);

		HttpEntity<Object> requestEntity = new HttpEntity<>(chatroompara, headers);

		ResponseEntity<String> responseEntity = restTemplate.exchange(baseURL, HttpMethod.POST, requestEntity,
				String.class);
        
		return responseEntity;
	}

}
