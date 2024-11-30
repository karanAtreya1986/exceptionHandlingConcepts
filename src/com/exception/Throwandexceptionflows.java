package com.exception;

import java.net.Socket;

public class Throwandexceptionflows {

	public static void main(String[] args) {

		// We used throw to throw checked exception and since we need to mandatorily
		// handle checked exception, so we use throws to propagate to correct area where
		// the exception should be displayed.
		
		//what happens in our code-
		//c() is throwing exception using throw
		//now we need to handle it
		//b() method calls c() method
		//either handle exception here or propagate using throws
		//we propagate to a() method
		//here we will handle it
		//so use try catch here.
		
		
		Throwandexceptionflows t1 = new Throwandexceptionflows();
		t1.a();

	}

	void a() {
		//compile error if we dont handle exception thrown by c() - Unhandled exception type Exception
		//we used try catch to handle exception here to handle the exceptionF
			try {
				b();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		System.out.println("we are in method a");
	}

	//compile error if we dont handle exception thrown by c() - Unhandled exception type Exception
	void b() throws Exception  {
		c();
	}

	//method c() manually throw an exception.
	//it has to be propagated
	void c() throws Exception {
		throw new Exception("exception from c method");
	}

}
