package com.exception.programs;

import java.io.FileNotFoundException;

public class Multipleexceptioninonecatchblock2 {

	static void samplemethod() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException | ArithmeticException e) {
			e.printStackTrace();

			// remove the throw keyword to avoid confusion
			// it was just for timepass by throwing exception again
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		samplemethod();
		System.out.println("rest of the code .........");
	}

}
