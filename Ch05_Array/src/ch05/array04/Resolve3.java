package ch05.array04;

import java.util.Scanner;

//3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요

public class Resolve3 {
	public static void main(String[] args) {
		int[] scores = new int [7];
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i =0;i<scores.length;i++) {
			System.out.print((i+1)+"번째 학생 학점입력>>");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		System.out.println("총점은:"+sum);
		System.out.println("평균은:"+(double)sum/scores.length);
		
	}
	
	public static void method() {
		for(int i = 0; i<7;i++) {
			
		}
	}

}
