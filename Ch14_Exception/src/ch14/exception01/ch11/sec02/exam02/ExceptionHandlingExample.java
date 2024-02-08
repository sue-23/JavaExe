package ch14.exception01.ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("java.langString 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println();
		
		try {
			Class.forName("java.lang.String2");
			System.out.println("java.langstring2클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
