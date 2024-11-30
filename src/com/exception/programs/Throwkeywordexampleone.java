package com.exception.programs;

public class Throwkeywordexampleone {

	// Throw is for throwing exceptions, not for handling them:

	static void samplemethod() {
		throw new NullPointerException("nullable");
	}

	public static void main(String[] args) {
		samplemethod();
	}

}
