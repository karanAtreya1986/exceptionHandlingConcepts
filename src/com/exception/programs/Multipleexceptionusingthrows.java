package com.exception.programs;

import java.io.IOException;

public class Multipleexceptionusingthrows {

	public static void main(String[] args) {



		Multipleexceptionusingthrows t1 = new Multipleexceptionusingthrows();
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
		//we get compile error - Unhandled exception type Exception
		//this is because the method c() being called throws parent exception.
		c();
	}

//	void c() throws Exception {
//		throw new Exception("exception from c method");
//	}
	
	//this is also not allowed.
	//we are using throws and using child exception
	//inside throw we are using parent exception.
//	void c() throws IOException {
//		throw new Exception("exception from c method");
//	}
//	
	void c() throws IOException {
		throw new IOException("exception from c method");
	}

}
