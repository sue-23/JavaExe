package ch03.for10;

import java.util.Scanner;

public class Resolve2 {
	
//	2. 369게임을 작성합니다.
//	   1~99까지의 정수를 입력받고
//	   3,6,9중 하나가 있으면 "박수짝"을 출력하고
//	   2개가 있으면 "박수짝짝"을 출력하세요
//	   예를 들어 13은 "박수짝"
//	   36인 경우는 "박수짝짝"을 출력하면 됩니다.
	
	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("1-99까지의 정수를 입력하시오!>>");
		i = sc.nextInt();
		
		int a = i/10; //10의자리
		int b = i%10; //1의자리
		int c = 0;//박수갯수
		
		if(i<10) {
			if(b%3==0) {
				c++;
			}
		}else {
			if(a%3==0) {
				c++;
			}
			if(b%3 ==0) {
				c++;
			}
			
		}
		
		switch(c) {
		
		case 0:System.out.println("박수 없음"); break;
			
		case 1:System.out.println("박수 짝"); break;
		case 2:System.out.println("박수 짝짝"); break;
		
		
		}
		sc.close();
		
		
		
		
	}

}
