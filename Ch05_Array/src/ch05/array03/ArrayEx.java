package ch05.array03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

	//배열 초기화
	/*배열은 클래스이고 kor은 스택(stack)에 위치하여 참조값(해시코드)이 들어있고
	 * 실제 배열의 값들은 힙(heap)메모리에 위치
	 * 
	 * 정식 선언 int[] kor = new int[3]이지만
	 * new -> heap메모리에 할당한다는 키워드.
	 * 프로그래머의 편의를 위해 아래처럼 초기화를 허용.
	 * C언어때부터의 관습.
	 */
		int[] kor = {98,99,100};
		System.out.println("배열의 크기:" +kor.length);
		
		int[] math = {100,66,77,88,99,34,56};
		System.out.println("배열의 크기:" + math.length);
		
		int[] eng = new int[] {100,66,77,88,99,34,56};
		System.out.println("배열의 크기:" + math.length);
		
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(math));
		System.out.println(Arrays.toString(eng));
		
		System.out.println();
		
		for(int i = 0; i<kor.length;i++) {
			System.out.println(kor[i]+"");
			System.out.println();
		}

	}

}
