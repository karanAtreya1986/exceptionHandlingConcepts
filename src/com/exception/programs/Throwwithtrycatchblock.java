package com.exception.programs;

import java.io.IOException;

public class Throwwithtrycatchblock {

	public static void main(String[] args) {
		Throwwithtrycatchblock.sampleMethod();
		System.out.println("rest of the code ........");
	}

	// how we can use throw and try-catch block together.
	// we didnt use throws here.

	// If throw throws checked exception, handle it using try-catch or throws
	// keyword.
	static void sampleMethod() {
		try {
			throw new IOException("throw keyword exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
