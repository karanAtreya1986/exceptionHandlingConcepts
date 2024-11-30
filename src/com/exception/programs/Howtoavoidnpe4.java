package com.exception.programs;

public class Howtoavoidnpe4 {

	public static void main(String[] args) {

		String s1 = null;

		// another best way to see if string is null and then if its equal to something.

		if (null!=s1 && s1.equals("abc")) {
			System.out.println("variables are same");
		} else {
			System.out.println("variables are not same");
		}
	}

}
