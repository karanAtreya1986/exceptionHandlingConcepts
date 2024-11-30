package com.exception.programs;

public class UseThrowandthrowuncheckedexception {

	// When we throw unchecked exception, we need not handle it.
	static void samplemethod() {
		throw new NullPointerException("device error");
	}

	public static void main(String[] args) {
		samplemethod();
	}

}
