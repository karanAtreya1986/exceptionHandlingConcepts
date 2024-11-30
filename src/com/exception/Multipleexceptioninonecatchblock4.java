package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Multipleexceptioninonecatchblock4 {

	// in this code we have only compile time exceptions.
	// rest everything same.
	static void samplemethod() {
		try {
			throw new FileNotFoundException();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} catch (Throwable e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		samplemethod();
		System.out.println("rest of the code .........");
	}

}
