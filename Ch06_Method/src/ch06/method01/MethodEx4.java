package ch06.method01;

import java.util.Scanner;

public class MethodEx4 {
	
	//main메서드 내의 계산하는 부분을 옮긴다.
		//void: return하지 않는 실행만 하는 함수.
		//int , string ---->return값 발생.
		public static int calcArith(int num0, int num1, String op) {
			int result = 0;

			switch (op) {
			case "+":
				result = num0 + num1;
				break;
			case "-":
				result = num0 - num1;
				break;
			case "*":
				result = num0 * num1;
				break;
			case "/":
				result = num0/num1;
				break;

			default:
				System.out.println("연산 불가능");
				break;
			}
			System.out.printf("%d %s %d = %d",num0,op,num1,result);
			
			// 이 함수를 호출한 곳으로 이 값을 가지고 돌아가
			return result;
			
		}
		
		//결과물 출력 메서드
		public static void viewResult(int result) {
			System.out.println("결과값>>"+result);

		}

		// 메서드 생성 전 코드
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			//1)처리하기 전에 입력받는 부분
			System.out.print("1번째 정수 입력>>");
			int num0 = sc.nextInt();
			System.out.print("2번째 정수 입력>>");
			int num1 = sc.nextInt();

			System.out.print("연산자 입력(+,-,*,/)>>");
			String op = sc.next();
			
			//메서드 호출
			int result = calcArith(num0, num1, op);
			viewResult(result);
			
			sc.close();
			
		}

}
