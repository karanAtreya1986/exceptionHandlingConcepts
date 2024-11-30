package com.exception.programs;

public class Handlenpewithtrycatch {

	public static void main(String[] args) {

		String s1 = null;

		// graceful handling of exceptions so entire java code runs without stopping
		// abruptly

		try {
			if (s1.equals("abc")) {
				System.out.println("same");
			} else {
				System.out.println("not same");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code .........");

	}

}
