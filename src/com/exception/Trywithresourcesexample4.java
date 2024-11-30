package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.BreakIterator;

public class Trywithresourcesexample4 {

	public static void main(String[] args) {
		// we need catch block to handle exceptions and for graceful landing.

		// give wrong path of the file and check if graceful landing.
		try (BufferedReader br = new BufferedReader(new FileReader("E:/Aa.txt"))) {

			String str;

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("rest of the code ........");
	}

}
