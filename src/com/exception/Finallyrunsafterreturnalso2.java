package com.exception;

public class Finallyrunsafterreturnalso2 {

	public static void main(String[] args) {
		int i2 = abc();
		System.out.println(i2);

	}

	// lets add return statement in catch block
	// in try block no return statement
	// in final block no return statement

	// when return present in catch block but not in try block
	// compile error - This method must return a result of type int
	// static int abc() {
	// try {
	// int num = 50 / 0;
	// } catch (Exception e) {
	// return 112;
	// } finally {
	// System.out.println("finally runs after return also");
	// }
	// }

	// if we add return only in catch block, then we need to give another return
	// statement for the whole function.
	// why because, code may or maynot go in catch block.
	// try block will always run.
	// so java is making sure that something is returned either from catch or from
	// method.
	static int abc() {
		try {
			int num = 50 / 0;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return 112;
			// after return any normal statement wont be reached.
			// so we get compile error - Unreachable code
//			System.out.println(e.getMessage());

		} finally {
			System.out.println("finally runs after return also");
		}
		return 0;
	}

}
