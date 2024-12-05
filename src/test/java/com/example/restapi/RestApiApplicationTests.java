package com.example.restapi;

import com.example.restapi.model.UserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApiApplicationTests {

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws JsonProcessingException {

		var json = "{\"user_names\":\"홍길동\",\"user_age\":10,\"email\":\"hong@gmail.com\",\"is_korean\":true}";
		System.out.println(json);

		var dto = objectMapper.readValue(json, UserRequest.class);
		System.out.println(dto);
	}

}
