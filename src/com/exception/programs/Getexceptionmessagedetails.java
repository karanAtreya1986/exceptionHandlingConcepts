package com.exception.programs;

public class Getexceptionmessagedetails {

	public static void main(String[] args) {
		
		//in this program we used try catch
		try {
			int data = 50 / 0;
		}catch (Exception e) {
			//to get the exception name.
			String s1=e.getMessage();
			System.out.println(e);
		}


		//this line will also be printed as we gracefully handled exception
		System.out.println("i wont be reached as unchecked has come");
	}

}
