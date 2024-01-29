package ch06.method01;

import java.util.Scanner;

//2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
//사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
//절대값이 계산되어서 출력되어야 합니다

public class Resolve2 {

	public static void calc(int a, int b) {
		int result = a - b;
		if (result >= 0) {
			System.out.println("|a-b|=" + result);
		} else {
			result = -result;
			System.out.println("|a-b|=" + result);
		}

	}
	

	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력>>");
		a = sc.nextInt();
		System.out.print("두번째 정수 입력>>");
		b = sc.nextInt();

		calc(a, b);
	}

}
