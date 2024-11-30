package com.exception;

public class Autocloseablewithtryresources3 {

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
			tryWithResourceWithAutoClose();
		} catch (Exception e) {
			String s1 = e.getMessage();
			System.out.println(s1);
		}
	}

	// here the method has to throw exception because m1 is of type myResource
	// myResource throws exception
	private static void tryWithResourceWithAutoClose() throws Exception {
		try (Myresource m1 = new Myresource()) {
			System.out.println("instance of my resource created");

			// we can throw any unchecked exception.
			if (true) {
				throw new NullPointerException("hi timepass exception");
			}
		}

	}

}
