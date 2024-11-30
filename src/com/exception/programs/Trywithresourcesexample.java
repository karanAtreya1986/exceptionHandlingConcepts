package com.exception.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.BreakIterator;

public class Trywithresourcesexample {

	public static void main(String[] args){
		try {
			String str;
			BufferedReader br = new BufferedReader(new FileReader("E:/A.txt"));
			// if we read in separate line and then go inside while loop
			// it will enter into infinite loop
			// because it has captured one value and has now become static at one place.
			str = br.readLine();
			while (str != null) {
				System.out.println(str);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("rest of the code .........");
	}

}
