package com.exception;

class Parent2 {
	void message() throws ArithmeticException {
		System.out.println("parent class method");
	}
}

//If super class has exception, then sub class or the sub class overridden method 
//can declare same  level exception, or no exception, or child 
//exception of the exception declared in parent class, but cannot 
//declare parent exception of the exception declared in parent class.

public class Exceptionrulesinheritanceandoverriding3 extends Parent2 {

	//no exception is fine.
	void message(){
		System.out.println("child class over ridden method ");
	}
	
	public static void main(String[] args) {
		Exceptionrulesinheritanceandoverriding3 e1=new Exceptionrulesinheritanceandoverriding3();
		e1.message();
	}
}
