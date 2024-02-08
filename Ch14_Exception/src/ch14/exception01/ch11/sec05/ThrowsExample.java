package ch14.exception01.ch11.sec05;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("예외처리:"+e.toString());
		}
	}

	private static void findClass() throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("java.lang.String2");
		
	}
}
