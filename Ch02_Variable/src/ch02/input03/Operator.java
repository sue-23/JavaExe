package ch02.input03;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		int result = 0;
		int num1, num2 = 0;
		
		//jdk class 키보드 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("더하기");
		
		System.out.print("1 >>");
		num1 = sc.nextInt();
		
		System.out.println("2 >>");
		num2 = sc.nextInt();
		
		//결과 계산
		result = num1 +num2;
		System.out.println("결과는" + result);
		
		
		
		
		//키보드 연결 종료
		sc.close();
	}
}
