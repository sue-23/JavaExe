package ch07.enum01.ch05.sec12;

import java.util.Scanner;

public class SwitchEx {
	
	public static void main(String[] args) {
		System.out.println("1. 짜장면");
		System.out.println("2. B");
		System.out.println("3. C");
		System.out.println("4. D");
		System.out.println("5. E");
		System.out.print("choose >>");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		//sel의 값과 같은 case로 이동하여 실행하고 break를 만나면 switch 문 종료
		
		switch(sel) {
		case 1:
			System.out.println("짜장");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
			
		default: //else
			System.out.println("해당 숫자 없음");
		
		}
	}

}
