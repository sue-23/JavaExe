package ch14.exception01.ch11.sec05;

public class ThrowsExample2 {

	public static void main(String[] args) throws Exception {
		findClass();
		
		
	}

	private static void findClass() throws ClassNotFoundException {


		Class.forName("java.lang.String2");
	}
}
