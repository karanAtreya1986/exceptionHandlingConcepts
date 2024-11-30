package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Multipleexceptioninonecatchblock5 {

	// in this code we have only run time exceptions.
	// rest everything same.

	// here if we give the same exception which we throw inside catch block it works
	// because these are run time exceptions and we need not handle them before they
	// run
	static void samplemethod() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException | ClassCastException e) {
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
