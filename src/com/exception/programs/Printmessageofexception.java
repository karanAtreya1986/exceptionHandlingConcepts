package com.exception.programs;

public class Printmessageofexception {

	public static void main(String[] args) {

		try {
			int data = 50 / 0;
			System.out.println("data is " + data);
		} catch (Exception e) {

			// e.getmessage() – gets the message of the exception, stating what is the
			// exception.
			String s1 = e.getMessage();
			System.out.println(s1);
		}

		System.out.println("rest of the code");
	}

}
