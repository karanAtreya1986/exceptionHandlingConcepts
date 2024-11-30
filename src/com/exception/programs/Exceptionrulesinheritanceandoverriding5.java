package com.exception.programs;

class Parent4 {
	void message() throws ArithmeticException {
		System.out.println("parent class method");
	}
}

//If super class has exception, then sub class or the sub class overridden method 
//can declare same  level exception, or no exception, or child 
//exception of the exception declared in parent class, but cannot 
//declare parent exception of the exception declared in parent class.

public class Exceptionrulesinheritanceandoverriding5 extends Parent4 {

	//same level of exception with same name
	void message() throws ArithmeticException{
		System.out.println("child class over ridden method ");
	}
	
	public static void main(String[] args) {
		Exceptionrulesinheritanceandoverriding5 e1=new Exceptionrulesinheritanceandoverriding5();
		e1.message();
	}
}
