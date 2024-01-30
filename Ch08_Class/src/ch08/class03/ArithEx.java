package ch08.class03;

/*
 * static메서드는 객체를 만들지 않아도 바로 사용가능함.
 */
public class ArithEx {

	public static void main(String[] args) {
		int a = 4, b = 1;
		int result = 0;
		result = Arith.add(a, b);
		System.out.println(result);
		result = Arith.sub(a, b);
		System.out.println(result);
		result = Arith.mul(a, b);
		System.out.println(result);
		result = Arith.div(a, b);
		System.out.println(result);
	}
}
