//package com.exception.programs;
//
//import java.io.IOException;
//
//public class Classimplementinterfacewithhigherexception implements Sampleinterfaceforexceptionchecks2 {
//
//	// class implementing interface cannot throw higher level exception than
//	// interface method.
//	// compile error - Exception Exception is not compatible with throws clause in
//	// Sampleinterfaceforexceptionchecks2.message()

//Child class implementing interface gives error when trying to implement a higher level exception:

//Child class implementing interface gives error when trying to implement a higher level exception:
//	@Override
//	public void message() throws Exception {
//		// TODO Auto-generated method stub
//
//	}
//
//	// compile error - Exception Exception is not compatible with throws clause in
//	// Sampleinterfaceforexceptionchecks2.counter()
//	@Override
//	public void counter() throws Exception {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void fountain() throws Exception {
//		// TODO Auto-generated method stub
//
//	}
//
//}
