package oodles.io.learnRestTemplate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import oodles.io.learnRestTemplate.modle.ChatRoomResponse;
import oodles.io.learnRestTemplate.service.Services;

@RestController
public class Controller {

	@Autowired
	Services services;

	@GetMapping("/usecontroller")
	ResponseEntity<String> useRestTemplate() {
		return services.useExchangeMethodsOfRestTemplate();
	}
}
