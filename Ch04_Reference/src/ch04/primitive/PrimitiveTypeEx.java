package ch04.primitive;

public class PrimitiveTypeEx {

	public static void main(String[] args) {

		/*지역변수 : stack에 생성되었다가
		 * main함수 영역 벗어날시 stack에서 사라짐
		 */
		byte b = 10;
		char ch = 'a';
		short s = 1000;
		int i = 9999999;
		long l = 9999999999L;
		float f = 3.14F;
		double d = 3.14;
		
		System.out.printf("byte size:%d\n", Byte.SIZE);
		System.out.printf("char size:%d\n", Character.SIZE);
		System.out.printf("short size:%d\n", Short.SIZE);
		System.out.printf("Int size:%d\n", Integer.SIZE);
		System.out.printf("Long size:%d\n", Long.SIZE);
		System.out.printf("float size:%d\n", Float.SIZE);
		System.out.printf("double size:%d\n", Double.SIZE);

		
	}

}
