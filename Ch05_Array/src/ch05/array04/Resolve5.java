package ch05.array04;

import java.util.Scanner;

//
//5. int배열을 10개 생성하세요.
//사용자로부터 10개의 값을 입력받고
//순서대로 출력하고  총합을 구하세요

public class Resolve5 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<num.length;i++) {
			System.out.print((i+1)+"번째 숫자 입력>>");
			num[i] = sc.nextInt();
			sum +=num[i];
			
		}
		System.out.println("총합:"+sum);
	}

}
