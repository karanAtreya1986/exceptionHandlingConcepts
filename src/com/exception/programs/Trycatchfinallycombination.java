package com.exception.programs;

public class Trycatchfinallycombination {
	
	public static void main(String[] args) {
	
		//all three blocks, best code.
		try {
			int a1[]=new int[5];
			a1[6]=100;
			System.out.println("array data is " + a1[4]);
		} catch (Exception e) {
			String s1=e.getMessage();
			System.out.println(s1);
		}finally {
			System.out.println("finally block");
		}
		
		System.out.println("rest of the code");

		
		
	}

}
