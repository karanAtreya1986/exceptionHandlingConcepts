package com.exception.programs;

public class TestCustomClassException3 {

	static void validate(int age) throws CustomException {
		if (age < 18) {
			throw new CustomException("user cannot vote !!!!!!!!");
		} else {
			System.out.println(" user can vote !!!!!!!! ");
		}
	}

	public static void main(String[] args) {
		try {
			
			//lets change age to 18 and see if it goes in else block
			validate(18);
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}
