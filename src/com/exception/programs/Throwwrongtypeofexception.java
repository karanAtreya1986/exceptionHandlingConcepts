package com.exception.programs;

public class Throwwrongtypeofexception {

	public static void main(String[] args) {

		// here rest of code will not be printed.
		// we have done non graceful exit.
		// because wrong exception is caught and we are not handling correct exception.
		// so finally is the last block to run.

		// If we throw wrong type of exception, then remaining code wont run properly-
		try {
			int data = 32443 / 0;
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of code .......");
	}

}
