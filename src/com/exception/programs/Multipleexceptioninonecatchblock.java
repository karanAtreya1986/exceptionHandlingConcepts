package com.exception.programs;

import java.io.FileNotFoundException;

public class Multipleexceptioninonecatchblock {

	static void samplemethod() {
		try {
			throw new NullPointerException();
			// compile time exception is throwing error because we are expecting run time
			// expection as per line 9
//		} catch (NullPointerException | FileNotFoundException | ArithmeticException e) {
//			e.printStackTrace();
//			throw e;
//		} 
		}
			catch (NullPointerException | ArithmeticException e) {
			e.printStackTrace();
			throw e;
		} 
			catch (Throwable e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		samplemethod();
		System.out.println("rest of the code .........");
	}

}
