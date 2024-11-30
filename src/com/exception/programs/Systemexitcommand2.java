package com.exception.programs;

public class Systemexitcommand2 {

	public static void main(String[] args) {

		try {
			int data = 35 / 0;
			System.out.println(data);
		} catch (Exception e) {
			String s1 = e.getMessage();

			// this will stop here itself.
			// output will be blank as error is not printed yet.
			System.exit(0);
			System.out.println(s1);

		} finally {
			System.out.println("finally block");
		}

		System.out.println("rest of code ");
	}

}
