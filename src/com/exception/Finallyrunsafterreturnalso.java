package com.exception;

public class Finallyrunsafterreturnalso {

	// here first finally statement comes in output then
	// code comes to main program
	// prints the return value

	// Return will always be the last line to run.
	public static void main(String[] args) {
		int i1 = abc();
		System.out.println(i1);

	}

	static int abc() {
		try {
			return 113;
		} finally {
			System.out.println("finally runs after return also");
		}
	}

}
