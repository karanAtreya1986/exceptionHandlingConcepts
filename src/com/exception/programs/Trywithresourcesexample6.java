package com.exception.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;

public class Trywithresourcesexample6 {

	// with throws keyword exception just propagated
	// exception not handled so no graceful landing.
	// this is try with resources.

	public static void main(String[] args) throws IOException {

		try (BufferedReader br = new BufferedReader(new FileReader("E:/Aa.txt"))) {

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}

		System.out.println("rest of the code ........");
	}

}
