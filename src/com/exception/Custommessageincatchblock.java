package com.exception;

public class Custommessageincatchblock {
	
	public static void main(String[] args) {
		
		try {
			int data = 5/0;
		} catch (Exception e) {
			
			//we can give our custom message also in catch block
			System.out.println("mistake in number division");
		}finally {
			System.out.println("finally here");
		}
		
		System.out.println("rest of the code here");
	}

}
