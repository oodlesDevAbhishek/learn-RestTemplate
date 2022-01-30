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
public class ConsumeServices {

	@Autowired
	private RestTemplate restTemplate;
	public ResponseEntity<ChatRoomResponse> useExchangeMethodsOfRestTemplate() {

		ChatRoomCreationParams chatroompara = new ChatRoomCreationParams();
		chatroompara.setChatRoomName("consumeCharRoom--01");
		List<Long> members = List.of(1001L, 2001L, 2003L);
		chatroompara.setMembers(members);

		String baseURL = "http://localhost:8080/v1/user/chat/chatRoom";
		String auth = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJyb2xlcyI6WyJST0xFX1VTRVIiLCJST0xFX0FETUlOIiwiUk9MRV9BUFBfQURNSU4iLCJST0xFX1NVUEVSQURNSU4iLCJST0xFX1NVUEVSX0FETUlOIl0sImlwIjoiMDowOjA6MDowOjA6MDoxIiwidXNlcklkIjoxMDAxLCJlbWFpbCI6ImFiaGlzaGVrLmd1cHRhMUBvb2RsZXMuaW8iLCJ1c2VybmFtZSI6IlNjYWZmb2xkIiwianRpIjoiZDk2MDhlMmEtMWM0Yi00YjFiLWE0MzItMjgzMDNkNjdjMjE4IiwiZXhwIjoxNjQzNTcxMTg2LCJpc3MiOiJDb21tdW5pY2F0aW9uIFNjYWZmb2xkIn0.IOqVy7BhqzI79j3383joN8m6Zo4x9Abtw7PszUe5QUU";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(auth);
		HttpEntity<Object> httpEntity = new HttpEntity<>(chatroompara, headers);
		return restTemplate.exchange(baseURL, HttpMethod.POST, httpEntity,
				ChatRoomResponse.class);
		}
}