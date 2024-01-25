package ch02.conditionalOperator12;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {

		int num;
		String str;
		Scanner sc = new Scanner(System.in);

		System.out.print("0-100숫자 입력-->");
		num = sc.nextInt();
		
		/**1)조건(삼항)연산자를 사용하는 방법
		 * A ? B:C; 3개의 항목
		 * 항목의 조건 ? true실행:false실행
		 */
		str = num >=85 ? "상위권":"하위권";
		
		System.out.println(str);
		
		//조건절 사용시
//		if(num >= 85) {
//			str = "상위권";
//		
//		}else {
//			str="하위권";
//		}
//		
//		System.out.println(str);
//		sc.close();
//	
	}

}
