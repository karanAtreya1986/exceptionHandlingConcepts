package com.exception;

import java.io.IOException;

class Parent1 {
	void message() {
		System.out.println("parent class method");
	}
}

public class Exceptionrulesinheritanceandoverridingwithcheckedexceptions extends Parent1 {

	//But we cannot throw checked exception in child class:
	//compile error - Exception IOException is not compatible with throws clause in Parent.message()
//	void message() throws IOException{
//		System.out.println("child class over ridden method ");
//	}
	
	public static void main(String[] args) {
		Exceptionrulesinheritanceandoverridingwithcheckedexceptions e1=new Exceptionrulesinheritanceandoverridingwithcheckedexceptions();
		e1.message();
	}
}
