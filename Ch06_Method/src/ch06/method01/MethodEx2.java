package ch06.method01;

import java.util.Scanner;

public class MethodEx2 {
	
	//num0과 num1은 add함수의 지역변수.->main함수의 지역변수와 무관, 이름만 같은 것. return실행시 종료.
	public static int add(int num0, int num1) {
		int result = num0+num1;
		//result를 가지고 돌아가라
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		//main함수의 지역변수로 Stack에 num0,num1이 초기화되어 생성됨.
		int num0 = 10, num1 = 5;
		//main함수만의 지역변수. return값이 돌아옴.
		int result = add(num0,num1);
		System.out.println("결과는"+result);
		
		int a =3, b = 8;
		int result1 = add(a,b);
		System.out.println("결과는"+result1);
	}

}
