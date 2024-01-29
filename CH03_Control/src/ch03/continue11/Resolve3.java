package ch03.continue11;

import java.util.Scanner;

//while Scanner.nextLine() 사용 예금 출금 조회 종료
public class Resolve3 {

	public static void method1() {
		// nextLine => 엔터값을 인식하는 함수.문자열로 저장.

		// money = Integer.parseInt(m) >> 타입 변환
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int a = 0;// 선택
		int money = 0;// 입력돈
		int b = 0;// 예금액
		int c = 0;// 출금액

		while (run) {
			System.out.println("----------");
			System.out.println("1.예금, 2:출금, 3.잔고, 4.종료");
			System.out.println("----------");

			System.out.print("선택>");
			a = sc.nextInt();

			if (a == 1) {
				System.out.print("예금액>");
				money = sc.nextInt();
				b = money;

			}
			if (a == 2) {
				System.out.print("출금액>");
				money = sc.nextInt();
				c = money;

			}
			if (a == 3) {
				money = b - c;
				System.out.println("잔고>" + money);

			}
			if (a == 4) {
				run = false;
				System.out.println("프로그램 종료");

			}
			sc.close();

		}
	}
}
