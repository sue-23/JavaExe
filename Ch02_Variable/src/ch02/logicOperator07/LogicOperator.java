package ch02.logicOperator07;

public class LogicOperator {

	public static void main(String[] args) {
		boolean logic;
		
		//And 피연산자 모두 ture
		logic = true && true;
		System.out.println("true && true =>"+logic);
		logic = true && false;
		System.out.println("true && false =>"+logic);
		//OR 피연산자 중 하나만 true
		logic = true || true;
		System.out.println("true || true =>"+logic);
		logic = true || false;
		System.out.println("true || false =>"+logic);
		//XOR 피연산자 하나는 true 하나는 false
		logic = true ^ true;
		System.out.println("true ^ true =>"+logic);
		logic = true ^ false;
		System.out.println("true ^ false =>"+logic);
		//not 피연산자 논리값 바꿈
		logic = !false;
		System.out.println("!false =>"+logic);
		
		
	}

}
