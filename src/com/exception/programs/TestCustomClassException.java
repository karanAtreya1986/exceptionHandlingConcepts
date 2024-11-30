package com.exception.programs;

public class TestCustomClassException {
	
	static void validate(int age) throws CustomException{
		if(age<18) {
			throw new CustomException("user cannot vote !!!!!!!!");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(14);
		} catch (CustomException e) {
			String s1=e.getMessage();
			System.out.println(s1);
		}
	}

}
