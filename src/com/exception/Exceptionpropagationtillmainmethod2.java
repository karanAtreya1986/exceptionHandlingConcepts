package com.exception;

import java.net.Socket;

public class Exceptionpropagationtillmainmethod2 {

	// propagation plus graceful end.
	// so entire code of java runs smoothly.
	public static void main(String[] args) {

		Exceptionpropagationtillmainmethod2 t1 = new Exceptionpropagationtillmainmethod2();
		t1.a();

		System.out.println("rest of the code");

	}

	void a() {

		try {
			b();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("we are in method a");
	}

	void b() throws Exception {
		c();
	}

	void c() throws Exception {
		throw new Exception("exception from c method");
	}

}
