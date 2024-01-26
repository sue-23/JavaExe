package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

	public static void method1() {

		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("정수 입력");
			int num = sc.nextInt();
			if(num==0)
				break;
			sum +=num;		
			
		}
		System.out.println(sum);
		
	}

	public static void method2() {
		
		boolean isRun = true;
		int sum = 0;
		
		
		while(isRun) {
			Scanner sc = new Scanner(System.in);
			System.out.println("정수입력");
			int num = sc.nextInt();
			
			if(num==0)
				isRun = false;
			
			sum +=num;
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		//method1();
		method2();

	}

}
