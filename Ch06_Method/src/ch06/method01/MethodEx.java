package ch06.method01;

import java.util.Scanner;

public class MethodEx {

	// 메서드 생성 전 코드
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//1)처리하기 전에 입력받는 부분
		System.out.print("1번째 정수 입력>>");
		int num0 = sc.nextInt();
		System.out.print("2번째 정수 입력>>");
		int num1 = sc.nextInt();

		System.out.print("연산자 입력(+,-,*,/)>>");
		String op = sc.next();
		int result = 0;
		//2) 처리
		switch (op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 - num1;
			break;
		case "*":
			result = num0 * num1;
			break;
		case "/":
			result = num0/num1;
			break;

		default:
			System.out.println("연산 불가능");
			break;
		}
		//3)결과값 출력
		System.out.printf("%d %s %d = %d",num0,op,num1,result);

		sc.close();
		
	}

}
