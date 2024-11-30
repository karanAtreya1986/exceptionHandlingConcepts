//package com.exception.programs;
//
//import java.io.IOException;
//
//public class Throwkeywordandexceptionpropagation {
//
//	static void samplemethod() {
//		throw new IOException("device error");
//	}
//
//	public static void main(String[] args) {
//		try {
//			samplemethod();
//
//			// compile error for the catch block- Unreachable catch block for IOException.
//			// This exception is never thrown from the try statement body
//			// this is because the method is not propagating exception with throws keyword.
//			// how will exception reach the catch block if its not propagated.
//		} catch (IOException e) {
//			System.out.println("checked exception is handled here");
//		}
//	}
//
//}



