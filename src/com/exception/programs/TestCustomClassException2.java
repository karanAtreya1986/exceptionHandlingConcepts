package com.exception.programs;

public class TestCustomClassException2 {

	static void validate(int age) throws CustomException {
		if (age < 18) {
			throw new CustomException("user cannot vote !!!!!!!!");
		} else {
			System.out.println(" user can vote !!!!!!!! ");
		}
	}

	public static void main(String[] args) {
		try {
			validate(14);
		} catch (CustomException e) {

			// lets print stack trace and see
			e.printStackTrace();
		}
	}

}
