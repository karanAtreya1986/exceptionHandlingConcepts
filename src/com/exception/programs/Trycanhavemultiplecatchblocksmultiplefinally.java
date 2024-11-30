package com.exception.programs;

import java.io.IOException;

public class Trycanhavemultiplecatchblocksmultiplefinally {

	public static void main(String[] args) {

		try {
			int data = 323/0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		}

		finally {
			System.out.println("finally block");
		}
		
		//only one finally allowed
		//compile error - Syntax error on token "finally", delete this token
//		finally {
//			System.out.println("second finally block");
//		}
	}

}
