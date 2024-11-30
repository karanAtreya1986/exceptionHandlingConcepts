package com.exception;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;

public class Multipleexceptionscatchblock2 {

	static void samplemethod() {
		try {
			System.out.println("try block");
			throw new NullPointerException();
		}

		// compile error - The exception NullPointerException is already caught by the
		// alternative Exception
		// compile error - The exception IndexOutOfBoundsException is already caught by
		// the alternative Exception

		// we cannot have parent exception clubbed here, because that will always
		// take precedence and other exceptions wont be reached at all.
//		catch (NullPointerException | IndexOutOfBoundsException | Exception e) {
//			e.printStackTrace();
//			System.out.println("catch block");
//		}

		// best way is to write parent exceptions separately in catch block.
		catch (Throwable e) {
			e.printStackTrace();
			System.out.println("second catch block");
		}

	}

	public static void main(String[] args) {
		samplemethod();
	}
}
