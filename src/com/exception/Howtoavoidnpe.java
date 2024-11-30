package com.exception;

public class Howtoavoidnpe {
	
	public static void main(String[] args) {
		
		String s1=null;
		
		//one way is compare string to avoid npe.
		if("abc".equals(s1)) {
			System.out.println("variables are same");
		}else {
			System.out.println("variables are not same");
		}
	}

}
