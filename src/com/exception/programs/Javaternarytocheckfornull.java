package com.exception.programs;

public class Javaternarytocheckfornull {

	public static void main(String[] args) {

		String s1 = null;

		//use ternary to check for null and then do required operation.
		
		
		//we are saying, check if string is null
		//if yes then return blanks
		//else return substring from index 0 to index 5
		String message=(s1==null)? "":s1.substring(0,5);
		System.out.println(message);
	}

}
