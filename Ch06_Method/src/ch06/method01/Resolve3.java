package ch06.method01;

import java.util.Scanner;

//3. int result = total(10, 100);
//위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
//total메서드를 작성하고 사용해보세요.

public class Resolve3 {

	public static int total(int a, int b) {
		int total = 0;
		
		for(int c = a;c<=b;c++) {
			total += c;
		}
		return total;
	}
	
	
	
	
	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자입력>>");
		a=sc.nextInt();
		System.out.print("마지막 숫자입력>>");
		b=sc.nextInt();
		
		int result = total(a,b);
		System.out.println("총합은>>" + result);
		
	}

}
