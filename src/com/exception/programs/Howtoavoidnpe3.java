package com.exception.programs;

public class Howtoavoidnpe3 {
	
	public static void main(String[] args) {
		
		String s1=null;
		
		//best way to see if string is null and then if its equal to something.
		
		if(s1!=null && s1.equals("abc")) {
			System.out.println("variables are same");
		}else {
			System.out.println("variables are not same");
		}
	}

}
