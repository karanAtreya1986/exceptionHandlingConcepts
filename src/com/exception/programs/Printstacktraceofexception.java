package com.exception.programs;

public class Printstacktraceofexception {
	
	public static void main(String[] args) {
		
		try {
			int data=50/0;
			System.out.println("data is " +data);
		} catch (Exception e) {
			
			//return type of printstacktrace() method is void.
			//e.printstacktrace() – gives entire path of where exception occurred.
			e.printStackTrace();
		}
		
		System.out.println("rest of the code outside try catch");
	}

}
