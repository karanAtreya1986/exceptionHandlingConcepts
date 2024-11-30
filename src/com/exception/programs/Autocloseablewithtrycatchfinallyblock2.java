package com.exception.programs;

public class Autocloseablewithtrycatchfinallyblock2 {

	// auto closeable is interface.
	// gives close() method, which is replacement of finally block.
	// finally is also optional
	// close() method will always be called before program ends

	// inner class
	static class Myresource implements AutoCloseable {

		@Override
		public void close() throws Exception {
			System.out.println("close method is called");

		}

	}

	public static void main(String[] args) {
		try {
			normalTryCatchFinallyBlock();
		} catch (Exception e) {
			String s1 = e.getMessage();
			System.out.println(s1);
		}
	}

	// in normal try catch finally block also the close() method works.
	// finally method is optional, so we removed it here.
	private static void normalTryCatchFinallyBlock() throws Exception {
		Myresource m1 = null;
		try {
			m1 = new Myresource();
			System.out.println("my resource object using normal try catch finally block");
			// this code wont run, because after the above the code it goes to catch block
			// to handle the below exception.
			if (true) {
				throw new Exception("this is timepass code");
			}
		} catch (Exception e) {
			System.out.println("hi am from catch block");
		}
	}

}
