package ch06.method01;

import java.util.Scanner;

//
//1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
//   작은 값을 반환하는 메서드를 작성하고 사용하세요

public class Resolve1 {

	public static void max(int a, int b) {
		if(a>b) {
			System.out.println("큰값은>>"+a);
		}else
			System.out.println("큰값은>>"+b);
			
	}
	
	public static void min(int a,int b) {
		
		if(a<b) {
			System.out.println("작은값은>>"+a);
		}else
			System.out.println("작은값은>>"+b);
	}
	public static void main(String[] args) {

		int a;//첫번째 숫자
		int b;//두번째 숫자
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오>>");
		a=sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오>>");
		b=sc.nextInt();
		
		max(a,b);
		min(a,b);
		
	}

}
