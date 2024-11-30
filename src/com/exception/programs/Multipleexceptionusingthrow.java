package com.exception.programs;

import java.io.IOException;

public class Multipleexceptionusingthrow {

	public static void main(String[] args) {

		Multipleexceptionusingthrow t1 = new Multipleexceptionusingthrow();
		t1.a();

	}

	void a() {

		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("lets see if this is printed");
		}

		System.out.println("we are in method a");
	}

	void b() throws IOException, NullPointerException {
		c();
	}

	void c() throws IOException {

		// at a time only one exception can be thrown using throw keyword
		throw new IOException("exception from c method");
//		throw new ArithmeticException(), //not allowing to add more than one exception.
		
		//below line gives compile error - Unreachable code
//		throw new NullPointerException("null pointer exception");
	}

}
