package com.exception;

public class Howtoavoidnpe2 {
	
	public static void main(String[] args) {
		
		String s1=null;
		
		//see the weird working.
		//when we compare in reverse then we get npe.
		if(s1.equals("abc")) {
			System.out.println("variables are same");
		}else {
			System.out.println("variables are not same");
		}
	}

}
