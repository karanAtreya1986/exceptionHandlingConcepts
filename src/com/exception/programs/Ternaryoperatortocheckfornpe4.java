package com.exception.programs;

public class Ternaryoperatortocheckfornpe4 {

	public static void main(String[] args) {

		String s1 = null;
		s1 = "abcde";

		// give proper range in sub string and everything works as expected

		// this way we can avoid npe
		// assign empty value to string if its null else do the required operation
		String messageString = (s1 == null) ? "" : s1.substring(0, 2);
		System.out.println("original string-------> " + s1);
		System.out.println("updated string----> " + messageString);

		System.out.println("Rest of the code ...........");
	}

}
