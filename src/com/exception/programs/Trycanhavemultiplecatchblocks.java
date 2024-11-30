package com.exception.programs;

import java.io.IOException;

public class Trycanhavemultiplecatchblocks {

	public static void main(String[] args) {

		// multiple catch blocks allowed for try.

		// Rules-
		// Each try can have zero or infinite catch blocks.
		// Each try can have only one finally block.

		try {
			int data = 323 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}

		// when an exception is not going to be thrown then compile error - Unreachable
		// catch block for IOException. This exception is never thrown from the try
		// statement body
//		catch (IOException e) {
//			System.out.println("IOException");
//		}
		finally {
			System.out.println("finally block");
		}
	}

}
