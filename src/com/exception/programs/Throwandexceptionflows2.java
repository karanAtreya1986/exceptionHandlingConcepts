package com.exception.programs;

import java.net.Socket;

public class Throwandexceptionflows2 {

	public static void main(String[] args) {

		// We used throw to throw checked exception and since we need to mandatorily
		// handle checked exception, so we use throws to propagate to correct area where
		// the exception should be displayed.

		// what happens in our code-
		// c() is throwing exception using throw
		// now we need to handle it
		// b() method calls c() method
		// either handle exception here or propagate using throws
		// we propagate to a() method
		// here we will handle it
		// so use try catch here.

		Throwandexceptionflows2 t1 = new Throwandexceptionflows2();
		t1.a();

	}

	void a() {
		// compile error if we dont handle exception thrown by c() - Unhandled exception
		// type Exception
		// we used try catch to handle exception here to handle the exception
		// added line 36 to see if its printed and it is.
		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("lets see if this is printed");
		}

		System.out.println("we are in method a");
	}

	// compile error if we dont handle exception thrown by c() - Unhandled exception
	// type Exception
	void b() throws Exception {
		c();
	}

	// method c() manually throw an exception.
	// it has to be propagated
	void c() throws Exception {
		throw new Exception("exception from c method");
	}

}
