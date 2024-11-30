package com.exception.programs;

import java.io.IOException;
import java.lang.reflect.UndeclaredThrowableException;

public class Multipleexceptionscatchblock3 {

	static void samplemethod() {
		try {
			System.out.println("try block");
			throw new NullPointerException();
		}

		catch (NullPointerException | IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("catch block");

			// we are doing time pass and again throwing exception at end of catch block
			// another exception trace will be printed
			throw e;
		}

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
