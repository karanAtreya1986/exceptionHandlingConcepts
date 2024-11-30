package com.exception;

import java.io.IOException;

public class Throwsuncheckedexception {

	public static void main(String[] args) {

		// throws can also throw unchecked exception.
		// best part is no need of propagation or handling it with trycatch.

		samplemethod();
	}

	static void samplemethod() throws NullPointerException {
		System.out.println("method throws null pointer exception");
	}

}
