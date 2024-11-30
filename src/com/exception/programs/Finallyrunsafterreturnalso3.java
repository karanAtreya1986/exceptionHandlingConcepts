package com.exception.programs;

public class Finallyrunsafterreturnalso3 {

	// return statement only added in finally block not in try or catch block.
	// if we add return in finally, the java code is surely going to the finally
	// block.
	// so we need not write a return for the entire method.

	public static void main(String[] args) {
		int i2 = abc();
		System.out.println(i2);

	}

	static int abc() {
		try {
			int num = 50 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally runs after return also");
			return 112;
			// return should be last line before normal statements.
			// compile error - Unreachable code

//			System.out.println("finally runs after return also");

		}
	}

}
