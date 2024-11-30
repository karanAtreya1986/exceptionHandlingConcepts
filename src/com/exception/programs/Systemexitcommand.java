package com.exception.programs;

public class Systemexitcommand {

	public static void main(String[] args) {

		try {
			int data=35/5;
			System.out.println(data);

			//the most powerful command to stop program run.
			//command command across java and c.

			//The only case when finally will not run and the rest of the code will not run.
			System.exit(0);
		} catch (Exception e) {
			String s1	=e.getMessage();
			System.out.println(s1);
		}finally {
			System.out.println("finally block");
		}

		System.out.println("rest of code ");
	}

}
