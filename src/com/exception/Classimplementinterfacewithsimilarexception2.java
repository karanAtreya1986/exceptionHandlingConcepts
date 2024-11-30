package com.exception;

import java.io.IOException;

public class Classimplementinterfacewithsimilarexception2 implements Sampleinterfaceforexceptionchecks2 {

	@Override
	public void message() throws NullPointerException {
		System.out.println("npe");

	}

	@Override
	public void counter() throws IOException {
		System.out.println("ioe");

	}

	@Override
	public void fountain() throws Exception {
		System.out.println("exception");

	}

	// we need to handle exception and checked exceptions on all places where the
	// method is called and that method itself is throwing some exception.
	public static void main(String[] args) {
		Classimplementinterfacewithsimilarexception2 c1 = new Classimplementinterfacewithsimilarexception2();
		try {
			c1.counter();
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			c1.fountain();
		} catch (Exception e) {

			e.printStackTrace();
		}
		c1.message(); // no error because this is run time exception and no handling needed for it.

	}
}