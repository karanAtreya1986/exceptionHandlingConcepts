package com.exception.programs;

public class Handlinguncheckedexceptionexampletwo {

	public static void main(String[] args) {

		int i[] = { 1, 2, 3, 4, 5 };

		// see how we have caught the line which can throw exception inside try block.
		// catch block handles error
		// all lines below catch also runs smoothly as we handled gracefully.

		for (int j = 0; j <= i.length; j++) {
			try {
				System.out.println(i[j]);
			} catch (ArrayIndexOutOfBoundsException e) {
				String s1 = e.getMessage();
				System.out.println(s1);
			}

		}
		System.out.println("code outside the try catch printed as we handled errors gracefully");
	}

}
