package ch05.array;

import java.util.Scanner;

public class NeedToArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * 학생 수가 만약 3명이 아니라 전국 학생이라면
		 * 아래처럼 변수를 선언하는 것은 거의 불가능하다.
		 * 그래서 새로운 문법이 필요해서 만들어진다.
		 * kor0,1,2의 공통점은
		 * 3개 모두 int 자료형, kor로 시작
		 * 그리고 뒤에 붙은 숫자는 순서를 나타낸다는 것이다.
		 */
		//3명의 국어점수 입력
		System.out.print("1 score");
		int kor0 = sc.nextInt();
		System.out.print("2 score");
		int kor1 = sc.nextInt();
		System.out.print("3 score");
		int kor2 = sc.nextInt();
		
		int total = kor0 +kor1 +kor2;
		double avg = (double)total/3;
		System.out.println("total:"+total);
		System.out.println("avg:" + avg);
		System.out.printf("avg: %.2f\n",avg);
		
		sc.close();
	}

}
