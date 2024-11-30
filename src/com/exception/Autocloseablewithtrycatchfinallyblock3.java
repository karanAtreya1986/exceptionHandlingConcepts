package com.exception;

public class Autocloseablewithtrycatchfinallyblock3 {

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
	// finally method is optional, we just wrote it
	private static void normalTryCatchFinallyBlock() throws Exception {
		Myresource m1 = null;
		try {
			m1 = new Myresource();
			System.out.println("my resource object using normal try catch finally block");
			// this code will run, because we are not doing graceful handling of exception
			// below.
			if (true) {
				throw new Exception("this is timepass code");
			}
		} finally {
			System.out.println("hi am from optional finally block");
			if (m1 != null) {
				m1.close();
			}
		}

	}

}
