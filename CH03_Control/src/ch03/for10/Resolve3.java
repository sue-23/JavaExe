package ch03.for10;

import java.util.Scanner;

public class Resolve3 {
//	3. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
//	   삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
//	   

	public static void main(String[] args) {
		int side =0; //빗변
		int a = 0;
		int b = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("빗변 side:>>");
		side = sc.nextInt();
		
		System.out.println("a:");
		a = sc.nextInt();
		
		System.out.println("b:");
		b = sc.nextInt();
		
		if(side>a && side>b) {
			if(side<a+b) {
				System.out.println("삼각형");
			}
		}
		else {
			System.out.println("삼각형 안됨");
		}
		
		
		
		
		
		
		
	}
}
