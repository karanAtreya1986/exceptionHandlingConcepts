package com.exception.programs;

public class CustomException extends Exception {

	// to create custom exception extend the exception class and this exception
	// class will take care of everything.

	// create constructor
	public CustomException(String s1) {
		super(s1);
	}

}
