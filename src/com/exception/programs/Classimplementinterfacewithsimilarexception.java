//package com.exception.programs;
//
//import java.io.IOException;
//
//public class Classimplementinterfacewithsimilarexception implements Sampleinterfaceforexceptionchecks2 {
//
//	@Override
//	public void message() throws NullPointerException {
//		System.out.println("npe");
//		
//	}
//
//	@Override
//	public void counter() throws IOException {
//		System.out.println("ioe");
//		
//	}
//
//	@Override
//	public void fountain() throws Exception {
//		System.out.println("exception");
//		
//	}
//	
//	public static void main(String[] args) {
//		Classimplementinterfacewithsimilarexception c1= new Classimplementinterfacewithsimilarexception();
//		c1.counter(); //compile error for checked exception - Unhandled exception type IOException
//		c1.fountain(); //compile error for exception - Unhandled exception type Exception
//		c1.message();
//		
//	}
//}