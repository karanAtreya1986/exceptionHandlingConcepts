package com.exception.programs;

import java.util.Scanner;

public class Enableassertworking {

	// to enable assert - write the program
	// run as - run configurations
	// select our class name
	// first time our class name will not be displayed
	// in such a case, just run the code normally
	// then again do run - run configurations and you should be able to see
	// click arguments tab
	// in vm arguments type "-ea"
	// apply
	// run

	// Assert to evaluate expression.
	// Assert keyword not replace of trycatch.

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("enter age ");
		int value = s1.nextInt();

		assert value >= 18 : "voting age is more than 18";

		System.out.println("age value is " + value);
		s1.close();
	}
}
