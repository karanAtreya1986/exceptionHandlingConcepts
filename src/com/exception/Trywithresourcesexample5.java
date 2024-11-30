package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.BreakIterator;

public class Trywithresourcesexample5 {

	// try with catch also can throws an exception.
	// no issue with that.
	// but with try catch is mandatory and it is already handling the exception
	public static void main(String[] args) throws Exception {
		try {
			String str;
			BufferedReader br = new BufferedReader(new FileReader("E:/A.txt"));

			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("rest of the code .............");
	}

}
