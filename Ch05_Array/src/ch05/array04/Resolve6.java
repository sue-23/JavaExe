package ch05.array04;

import java.util.Scanner;

//6. 5명의 학생의 이름과 점수를 입력받고
//해당학생의 이름과 학점이 A, B, C, D, F로 출력되도록 하세요
//A : 90이상, B : 80이상, C : 70이상, D : 60이상, F : 60미만

public class Resolve6 {

	public static void main(String[] args) {
		int[] scores = new int[5];
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.print((i + 1) + "번째학생 점수>>");
			scores[i] = sc.nextInt();
			System.out.print((i + 1) + "번째학생 이름>>");
			names[i] = sc.next();

			if (scores[i] >= 90) {
				System.out.println(names[i] + "학생의 학점은:A");
			} else if (scores[i] >= 80) {
				System.out.println(names[i] + "학생의 학점은:B");
			} else if (scores[i] >= 70) {
				System.out.println(names[i] + "학생의 학점은:C");
			} else if (scores[i] >= 60) {
				System.out.println(names[i] + "학생의 학점은:D");
			} else
				System.out.println(names[i] + "학생의 학점은:F");

		}
	}

}
