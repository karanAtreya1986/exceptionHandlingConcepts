package com.exception.programs;

class Parent3 {
	void message() throws ArithmeticException {
		System.out.println("parent class method");
	}
}

//If super class has exception, then sub class or the sub class overridden method 
//can declare same  level exception, or no exception, or child 
//exception of the exception declared in parent class, but cannot 
//declare parent exception of the exception declared in parent class.

public class Exceptionrulesinheritanceandoverriding4 extends Parent3 {

	//same level of exception but different name
	void message() throws NullPointerException{
		System.out.println("child class over ridden method ");
	}
	
	public static void main(String[] args) {
		Exceptionrulesinheritanceandoverriding4 e1=new Exceptionrulesinheritanceandoverriding4();
		e1.message();
	}
}
