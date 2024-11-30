package com.exception.programs;

import java.util.Scanner;

public class Assertkeywordworking {

	// you have to enable assert for it to work.
	// now we have not enabled it, so assert does not work.

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("enter age ");
		int value = s1.nextInt();

		// After colon we write error message which should be displayed if assert
		// evaluates to false.
		assert value >= 18 : "voting age is more than 18";

		System.out.println("age value is " + value);
		s1.close();
	}

}
