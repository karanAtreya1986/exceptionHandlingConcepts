package com.exception;

import java.io.IOException;

public class Checkedexceptionstobehandledmandatorily {

	public static void main(String[] args) {

		Checkedexceptionstobehandledmandatorily t1 = new Checkedexceptionstobehandledmandatorily();
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

//	void b()  {
//		//compile error - Unhandled exception type IOException
//		c();
//	}

	void b() throws IOException {
		// compile error - Unhandled exception type IOException
		c();
	}

	// when checked exception is thrown using throw keyword we have to keep
	// propagating it till top using throws keyword.
	// else we keep getting compile error as unhandled exception and cannot move
	// forward.

	void c() throws IOException {
		throw new IOException("exception from c method");
	}

}
