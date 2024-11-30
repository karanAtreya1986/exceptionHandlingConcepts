package com.exception.programs;

import java.io.FileNotFoundException;

public class Multipleexceptioninonecatchblock6 {

	static void samplemethod() {
		try {
			throw new NullPointerException();
		} catch (Throwable e1) {
			e1.printStackTrace();
		}

		// never ever put parent exceptions at top
		// compile error - Unreachable catch block for NullPointerException. It is
		// already handled by the catch block for Throwable
//		catch (NullPointerException | ArithmeticException e) {
//			e.printStackTrace();
//			throw e;
//		}

	}

	public static void main(String[] args) {
		samplemethod();
		System.out.println("rest of the code .........");
	}

}
