package com.exception.programs;

public class Systemexitcommand3 {

	public static void main(String[] args) {

		try {
			int data = 35 / 0;
			System.out.println(data);
		} catch (Exception e) {
			String s1 = e.getMessage();

			System.out.println(s1);

		} finally {
			System.out.println("finally block");

			// this will stop the code here itself.
			System.exit(0);
		}

		System.out.println("rest of code ");
	}

}
