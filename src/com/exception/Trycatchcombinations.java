package com.exception;

public class Trycatchcombinations {
	
	public static void main(String[] args) {
		
		//Try catch block has to be written inside method, not at class level.
		//Try has to come with catch or finally or catch-finally.
		//Try cannot come alone.
		
		try {
			int a1[]=new int[5];
			a1[6]=100;
			System.out.println("array data is " + a1[4]);
		} catch (Exception e) {
			String s1=e.getMessage();
			System.out.println(s1);
		}
		
		System.out.println("rest of the code");

		
		
	}

}
