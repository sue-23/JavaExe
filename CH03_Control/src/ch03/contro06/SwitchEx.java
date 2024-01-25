package ch03.contro06;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		System.out.println("봄");
		System.out.println("여름");
		System.out.println("가을");
		System.out.println("겨울");
		System.out.print("choose >>");
		
		Scanner sc = new Scanner(System.in);
		String sel = sc.nextLine();
		
		switch(sel) {
		case "봄":
			System.out.println("벗꽃");
			break;
		case "여름":
			System.out.println("더움");
			break;
		case "가을":
			System.out.println("fall");
			break;
		case "겨울":
			 System.out.println("winter");
			 break;
			 
		default:
			System.out.println("그런거 없다.");
		
		
		}
	
	
	}
	
}
