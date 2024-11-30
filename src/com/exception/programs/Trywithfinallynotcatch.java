package com.exception.programs;

public class Trywithfinallynotcatch {

	public static void main(String[] args) {

		// here first finally block printed then the exception is printed.
		// since exception not catched so the its not graceful end, so code stops
		// abruptly and no lines run after the finally block.

		try {
			int a1[] = new int[5];
			a1[6] = 100;
			System.out.println("array data is " + a1[4]);
		} finally {
			System.out.println("finally block");
		}

		System.out.println("rest of the code");

	}

}
