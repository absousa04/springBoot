package com.anderson.firstSpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/show")
public class FirstSpringBootController {

	@GetMapping

	@ApiResponses(value = {

	@ApiResponse(code = 200, message = "Email encontrado!"),

	@ApiResponse(code = 404, message = "Email não encontrado!")

	})
	public String showText() {
		return "Hello, Andderson";
	}	
	
	@GetMapping
	("/")
	public String index() {
		return "Index OK";
	}
	
}
