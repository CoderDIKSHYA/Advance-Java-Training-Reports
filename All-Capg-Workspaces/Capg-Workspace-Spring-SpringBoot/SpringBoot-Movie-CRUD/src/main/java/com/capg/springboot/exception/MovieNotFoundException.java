package com.capg.springboot.exception;

/*
Custom exception class used when
movie ID is not found in the system.
*/

public class MovieNotFoundException extends RuntimeException {

	public MovieNotFoundException(String message) {

		super(message);
	}
}