package com.exception.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.BreakIterator;

public class Trywithresourcesexample2 {

	public static void main(String[] args) {
		try {
			String str;
			BufferedReader br = new BufferedReader(new FileReader("E:/A.txt"));

			// this is how the string will not be static and keep moving into file.
			// now it does not go into infinite loop.
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code .........");
	}

}
