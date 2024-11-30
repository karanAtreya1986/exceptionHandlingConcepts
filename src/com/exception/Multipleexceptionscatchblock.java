package com.exception;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;

public class Multipleexceptionscatchblock {

	static void samplemethod() {
		try {
			System.out.println("try block");
			throw new NullPointerException();
			// after throw if we write statements in same block we get unreachable code.
//			System.out.println("try block"); // compile error - Unreachable code
		}
		// if you write an exception name which can never come, compile error
		// Unreachable catch block for IOException. This exception is never thrown from
		// the try statement body
//		} catch (NullPointerException | IOException | IndexOutOfBoundsException e) {
//			e.printStackTrace();
//		}
		catch (NullPointerException | IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("catch block");
		}

		// this catch block wont run because exception caught in the earlier catch
		// block.
		catch (Throwable e) {
			e.printStackTrace();
			System.out.println("second catch block");
		}

	}

	public static void main(String[] args) {
		samplemethod();
	}
}
