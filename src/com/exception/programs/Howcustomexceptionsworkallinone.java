package com.exception.programs;

class Invalidageexception extends Exception {
	Invalidageexception(String s1) {
		super(s1);
	}
}

public class Howcustomexceptionsworkallinone {

	// see how custom exceptions are written
	// how they are propagated and the message printed on screen

	public static void main(String[] args) {

		try {
//			validate(15); //age less than 18
//			validate(18); //age equal to 18
			validate(198); //age greater than 18
		} catch (Invalidageexception e) {
			String s2 = e.getMessage();
			System.out.println(s2);
			System.out.println("print stack trace below ----->");
			e.printStackTrace();

		}

		System.out.println("rest of the code ..........");

	}

	// when age is less than 18
	static void validate(int age) throws Invalidageexception {
		if (age < 18) {
			throw new Invalidageexception("age should be greater than 18");
		} else {
			System.out.println("can vote as you are 18 years old");
		}
	}

}
