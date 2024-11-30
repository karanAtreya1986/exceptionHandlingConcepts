package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CheckedExceptionExample1 {

	public static void main(String[] args) {

		BufferedReader br = null;
		Reader r = new InputStreamReader(System.in);
		br = new BufferedReader(r);
		String str = null;

		do {
			System.out.println("enter input, exit to quit");
			try {
				// this line throws checked exception and we cannot run our program without
				// fixing it.
				str = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(str);
		} while (!str.equalsIgnoreCase("exit"));
	}

}
