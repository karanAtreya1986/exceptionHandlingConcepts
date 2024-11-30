package com.exception.programs;

import java.io.IOException;

import javax.imageio.IIOException;

public class Throwcheckedanduncheckedexception2 {

	// When we throw checked exception, they have to be handled because checked
	// exception has to be always handled before running code.
	// Unchecked exception need not be handled as we come to know of the exception
	// only after run.

	void abc() throws IOException {

		// first this sentence printed then the exception in throw printed.
		System.out.println("try throw with checked");
		throw new IOException("device error");

		// throw unchecked exception
		// compile error - Unreachable code
//		throw new NullPointerException("hello null");
	}

	public static void main(String[] args) {
		Throwcheckedanduncheckedexception2 o1 = new Throwcheckedanduncheckedexception2();

		// here also we need to handle exception because method is throwing it,
		// else we get compile error.- Unhandled exception type IOException
//		o1.abc();
		try {
			o1.abc();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// this will also run as we handled errors gracefully.
		System.out.println("check if rest of code runs");

	}
}
