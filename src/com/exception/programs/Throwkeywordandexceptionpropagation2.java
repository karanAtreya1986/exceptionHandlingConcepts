package com.exception.programs;

import java.io.IOException;

public class Throwkeywordandexceptionpropagation2 {

	static void samplemethod() throws IOException {
		throw new IOException("device error");
	}

	public static void main(String[] args) {
		try {
			samplemethod();

			// now since exception is propagated using throws, so it works well.
			// so keep propagating till main() method or till the start of the code.
			// so try-catch handles it much more efficiently.
		} catch (IOException e) {
			System.out.println("checked exception is handled here");
		}
	}

}
