package com.exception.programs;

public class Ternaryoperatortocheckfornpe {

	public static void main(String[] args) {

		String s1 = null;

		// if the condition is true, then print the first part after question mark
		// if the condition is false then print the second part after question mark
		String messageString = (s1 == null) ? "" : s1.substring(0, 5);
		System.out.println(messageString);

		System.out.println("Rest of the code ...........");
	}

}
