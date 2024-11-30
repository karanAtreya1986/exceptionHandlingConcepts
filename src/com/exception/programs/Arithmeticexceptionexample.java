package com.exception.programs;

public class Arithmeticexceptionexample {

	public static void main(String[] args) {

		// example of arithmetic exception and handling it gracefully.
		// code after exception will also run as we handled nicely.
		int num = 0;

		try {
			num = 32424 / 0;
		} catch (ArithmeticException e) {
			String s1 = e.getMessage();
			System.out.println(s1);
		}

		System.out.println("rest of the code also runs due to graceful handling");
	}

}
