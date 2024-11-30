package com.exception.programs;

class Parent5 {
	void message() throws ArithmeticException {
		System.out.println("parent class method");
	}
}

//If super class has exception, then sub class or the sub class overridden method 
//can declare same  level exception, or no exception, or child 
//exception of the exception declared in parent class, but cannot 
//declare parent exception of the exception declared in parent class.

public class Exceptionrulesinheritanceandoverriding6 extends Parent5 {

	//child class overridden method cannot have exception of parent type
	
	//compile error - Exception Exception is not compatible with throws clause in Parent5.message()
//	void message() throws Exception{
//		System.out.println("child class over ridden method ");
//	}
//	
	public static void main(String[] args) {
		Exceptionrulesinheritanceandoverriding6 e1=new Exceptionrulesinheritanceandoverriding6();
		e1.message();
	}
}
