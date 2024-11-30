package com.exception;

public class Classimplementinterfaceuncheckedexception implements Sampleinterfaceforexceptionchecks {

	// class implementing interface can throw unchecked exception and no need to
	// handle it as its unchecked.
	@Override
	public void message() throws NullPointerException {
		System.out.println("class throws null pointer");

	}

	public static void main(String[] args) {
		Classimplementinterfaceuncheckedexception c1 = new Classimplementinterfaceuncheckedexception();
		c1.message();
	}

}
