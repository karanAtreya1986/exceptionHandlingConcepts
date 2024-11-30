package com.exception;

import java.net.Socket;

public class Exceptionpropagationtillmainmethodwithuncheckedexceptions {

	public static void main(String[] args) {

		Exceptionpropagationtillmainmethodwithuncheckedexceptions t1 = new Exceptionpropagationtillmainmethodwithuncheckedexceptions();
		t1.a();

		// the below code will not run because exception not handled gracefully.
		// Exception propagation mandatory with checked exception and for unchecked all
		// depends on user coding experience-

		// Exception propagation not mandatory for unchecked exceptions-
		System.out.println("rest of the code");

	}

	void a() {

		b();

		System.out.println("we are in method a");
	}

	void b() {
		c();
	}

	void c() {
		throw new ArithmeticException("exception from c method");
	}

}
