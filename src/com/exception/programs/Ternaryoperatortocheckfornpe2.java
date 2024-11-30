package com.exception.programs;

public class Ternaryoperatortocheckfornpe2 {

	public static void main(String[] args) {

		String s1 = null;

		// if the condition is true, then assign blank to s1 which in turn is assigned
		// to messageString variable
		// if the condition is false then assign substring() method result to s1 which
		// in turn is assigned to messageString variable
		String messageString = (s1 == "abv") ? "" : s1.substring(0, 5);
		System.out.println(messageString);

		System.out.println("Rest of the code ...........");
	}

}
