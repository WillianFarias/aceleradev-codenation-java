package com.example.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
public class UserController {
	
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Caso a validacao falhe sera lancada uma excessao  MethodArgumentNotValidException
	@PostMapping("/users")
	ResponseEntity<String> addUser (@Valid @RequestBody User user){
		//persisting the user
		return ResponseEntity.ok("User is valid");
	}
	
	//Processando o resultado da validacao com @ExceptionHandler
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex){
		
	}
	
}
