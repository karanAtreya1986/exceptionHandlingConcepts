package com.exception.programs;

import java.net.Socket;

public class Exceptionpropagationtillmainmethod {

	// If you don’t want to handle the exception and let jvm handle it keep adding
	// throws and
	// perform exception propagation-

	// in this case the "rest of the code" will not run because we have not handled
	// exceptions gracefully.

	public static void main(String[] args) throws Exception {

		Exceptionpropagationtillmainmethod t1 = new Exceptionpropagationtillmainmethod();
		t1.a();

		System.out.println("rest of the code");

	}

	void a() throws Exception {

		b();

		System.out.println("we are in method a");
	}

	void b() throws Exception {
		c();
	}

	void c() throws Exception {
		throw new Exception("exception from c method");
	}

}
