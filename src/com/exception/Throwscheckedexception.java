package com.exception;

import java.io.IOException;

public class Throwscheckedexception {

	// throws can throw a checked exception.
	// but checked exception has to be propagated or handled with try-catch.
	// else we get compile error in line 13.
	public static void main(String[] args) {

		// compile error - Unhandled exception type IOException
//		samplemethod();
	}

	static void samplemethod() throws IOException {
		System.out.println("method throws io exception");
	}

}
