package ch03.contro01;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {

		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0-100점수 입력:");
		score = sc.nextInt();
		
		if(score>=90)
			System.out.println("A");
		
		sc.close();
	}

}
