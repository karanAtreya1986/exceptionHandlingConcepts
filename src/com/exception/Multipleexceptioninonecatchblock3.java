package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Multipleexceptioninonecatchblock3 {

	static void samplemethod() {
		try {
			throw new FileNotFoundException();
			// if we are throwing an compile time exception
			// we cant reuse it in catch block
			// compile error - The exception FileNotFoundException is already caught by the
			// alternative IOException

			// we can add run time exceptions here though we are throwing compile time
			// exception
			// this is because run time need not be handled by us before code runs.
//		} catch (NullPointerException | ArithmeticException | FileNotFoundException | IOException e) {
//			e.printStackTrace();
//		} 
		} catch (NullPointerException | ArithmeticException | IOException e) {
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
