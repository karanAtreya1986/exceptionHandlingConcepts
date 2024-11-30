package com.exception;

public class Ternaryoperatortocheckfornpe3 {

	public static void main(String[] args) {

		String s1 = null;
		s1 = "av";

		// we get string index out of bound exception.
		// this is because we are telling to extract from index which is not present.
		String messageString = (s1 == null) ? "" : s1.substring(0, 5);
		System.out.println(messageString);

		System.out.println("Rest of the code ...........");
	}

}
