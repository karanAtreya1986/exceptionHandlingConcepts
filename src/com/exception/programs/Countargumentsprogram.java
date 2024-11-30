package com.exception.programs;

public class Countargumentsprogram {

	public static void main(String[] args) {

		// we can pass in any type of arguments like string, boolean, int, float,
		// double, char etc.

		// adding arguments is also via run configuration above the place where we enter
		// "-ea"

		int length = args.length;
		assert length == 6 : "the length value has to be minimum 5";
		System.out.println("argument count is " + length);
	}

}
