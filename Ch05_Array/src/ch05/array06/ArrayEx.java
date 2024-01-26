package ch05.array06;

import java.util.Arrays;

public class ArrayEx {
//배열의 얕은 복사/깊은복사
	public static void main(String[] args) {
		//얕은 복사
		int[] scores = {100,200,300,400,500};
		int[] scores1 = scores;
		int[] scores2 = scores1;
		
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println();
		
		System.out.println(scores);
		System.out.println(scores1);
		System.out.println(scores2);
		
		//깊은 복사(힙에 별도의 공간을 생성한 수 scores4는 
		//		 새로 생성한 공간을 가리키게 된다.)
		//; 기존 공간과 분리되는 공간이다.
		
		int[] scores4 = Arrays.copyOf(scores1, scores.length);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores2));
		System.out.println(Arrays.toString(scores4));

		
		
	}

}
