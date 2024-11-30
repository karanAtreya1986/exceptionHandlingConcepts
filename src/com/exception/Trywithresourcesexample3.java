package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;

public class Trywithresourcesexample3 {

	public static void main(String[] args) throws IOException {

		// add the line as parameter inside try block.
		// this is try with resources.

		// Write the line which throws checked exception as parameter to try block.

		// Try with resources does not require catch also.

		// Catch and finally now optional blocks.
		// But if we want to handle exceptions we need catch block.
		// Try with resources helps us handle exceptions with throws also.
		try (BufferedReader br = new BufferedReader(new FileReader("E:/A.txt"))) {

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		}

		System.out.println("rest of the code ........");
	}

}
