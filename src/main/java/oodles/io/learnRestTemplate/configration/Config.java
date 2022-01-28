package oodles.io.learnRestTemplate.configration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Configuration
public class Config {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	public JavaTimeModule dateTimeModule(){
	    return new JavaTimeModule();
	}
}
