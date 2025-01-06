package com.example.springbootbackend.excpetion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public RecourceNotFoundException(String message) {
		super(message);
	}
}
