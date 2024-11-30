package com.exception;

class Parent {
	void message() {
		System.out.println("parent class method");
	}
}

//If super class has no exception, then sub class and overridden methods cannot 
//declare checked exceptions.  
//Unchecked exceptions are still allowed by sub class and overridden methods.

public class Exceptionrulesinheritanceandoverriding extends Parent {

	void message() throws ArithmeticException{
		System.out.println("child class over ridden method ");
	}
	
	public static void main(String[] args) {
		Exceptionrulesinheritanceandoverriding e1=new Exceptionrulesinheritanceandoverriding();
		e1.message();
	}
}
