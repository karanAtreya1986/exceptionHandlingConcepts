package com.exception;

import java.io.IOException;

public class Throwscheckedexception2 {

	// throws can also throw checked exception.
	// handled with propagation.
	public static void main(String[] args) throws IOException {

		samplemethod();
	}

	static void samplemethod() throws IOException {
		System.out.println("method throws io exception");
	}

}
