package com.exception.programs;

public class Finallyrunsafterreturnalso5 {

	// return statement present in all the blocks.
	// when only try-catch is there, if there is return statement in catch block,
	// that return will be returned in case of errors.

	public static void main(String[] args) {
		int i2 = abc();
		System.out.println(i2);

	}

	static int abc() {
		try {
			int num = 50 / 0;
			// this wont run as the line 13 throws error.
			System.out.println("try block");
			return 12;
			// return has to be last statement before normal statements.
			// compile error - Unreachable code
//			System.out.println("try block");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 13;
		}
	}

}
