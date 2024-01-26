package ch05.array07;

import java.util.Arrays;

public class ArrayEx {
	/*
	 * 배열의 정렬
	 * Arrays.sort(scores); 데이터가 적을때
	 * Arrays.paralleSort(scores); 데이터가 많을 때
	 */
	
	
	public static void main(String[] args) {
		
		int[] scores = {1,5,7,4,5,65};
		System.out.println(Arrays.toString(scores));
		//정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
	}

}
