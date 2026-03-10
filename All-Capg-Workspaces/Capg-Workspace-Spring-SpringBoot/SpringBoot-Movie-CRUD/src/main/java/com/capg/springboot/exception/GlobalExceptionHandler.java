package com.capg.springboot.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
Global exception handler handles exceptions
for the entire application.
*/

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MovieNotFoundException.class)
	public String handleMovieException(MovieNotFoundException ex) {

		return ex.getMessage();
	}
}