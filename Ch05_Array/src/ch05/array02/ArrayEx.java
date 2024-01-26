package ch05.array02;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// int자료형으로 kor의 대표명을 가진 크기 3인 배열을 생성
		//배열은 메모리 내부에서 연속공간으로 할당된다.
		int i = 8;
		int[] kor = new int[i];

		
		for( i = 0;i<kor.length;i++) {
			System.out.print((i+1)+"번째 학생의 국어 점수 입력>>");
			kor[i] = sc.nextInt();
		}
//		// 3명의 국어점수 입력
//		System.out.print("1 score");
//		kor[0] = sc.nextInt();
//		System.out.print("2 score");
//		kor[1] = sc.nextInt();
//		System.out.print("3 score");
//		kor[2] = sc.nextInt();
	
		//kor[i] ->i를 인덱스라 지칭,0부터 시작
		int total = 0;
		for(i = 0; i<kor.length;i++) {
			total += kor[i];
		}

		
		double avg = (double) total / 3;
		System.out.println("total:" + total);
		System.out.println("avg:" + avg);
		System.out.printf("avg: %.2f\n", avg);

		sc.close();
	}

}
