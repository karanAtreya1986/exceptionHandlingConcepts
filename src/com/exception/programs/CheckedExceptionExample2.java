package com.exception.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CheckedExceptionExample2 {

	// one complete code with try-catch-finally usage.

	public static void main(String[] args) {

		BufferedReader br = null;
		Reader r = new InputStreamReader(System.in);
		br = new BufferedReader(r);
		String str = null;
		try {
			do {
				System.out.println("enter input, exit to quit");
				str = br.readLine();
				System.out.println(str);
			} while (!str.equalsIgnoreCase("exit"));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}

}
