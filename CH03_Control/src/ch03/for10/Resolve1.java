package ch03.for10;

import java.util.Scanner;

public class Resolve1 {
//	1. 돈의 액수를 입금하세요
//	   입금한 돈을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 각 몇개로 변환되는지 출력하세요
//	   출력 개수는 단위가 큰 것 순서로 계산합니다
//	   예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
	
	public static void main(String[] args) {
		int money = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 돈은?>>");
		money = sc.nextInt();
		
		System.out.println("50000:" + money/50000);
		money %=50000;
		System.out.println("10000:" + money/10000);
		money %=10000;
		System.out.println("5000:" + money/5000);
		money %=5000;
		System.out.println("1000:" + money/1000);
		money %=1000;
		System.out.println("500:" + money/500);
		money %=500;
		System.out.println("100:" + money/100);
		money %=100;
		System.out.println("50:" + money/50);
		money %=50;
		System.out.println("10:" + money/10);
		money %=10;
		System.out.print("1:" + money/1);

		sc.close();
		
		
		
		
		
	}

}
