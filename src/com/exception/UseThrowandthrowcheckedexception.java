package com.exception;

import java.io.IOException;

public class UseThrowandthrowcheckedexception {

	// throw can also throw checked exception.

	// Checked exceptions cannot be propagated using throw alone, we need throws or
	// try-catch.

	static void samplemethod() throws IOException {
		throw new IOException("device error");
	}

	public static void main(String[] args) throws IOException {
		samplemethod();
	}

}
