package com.exception;

public class Howtoavoidnullpointerexceptions {

	public static void main(String[] args) {

		String s1 = null;

		// in this case we compare null to string, so we get NPE
		// program stops abruptly as not handled it
		if (s1.equals("abc")) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
	}

}
