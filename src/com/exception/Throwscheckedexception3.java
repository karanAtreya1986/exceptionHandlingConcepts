package com.exception;

import java.io.IOException;

public class Throwscheckedexception3 {

	// throws can also throw checked exception.
	// handled with try catch.
	public static void main(String[] args) {

		try {
			samplemethod();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void samplemethod() throws IOException {
		System.out.println("method throws io exception");
	}

}
