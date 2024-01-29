package ch05.array08;

import java.util.Arrays;

//2. 정수 배열 5개를 할당하고
//Arrays.sort를 사용하지 말고 최소값과 최대값을 얻으세요

public class Resolve2 {

	public static void main(String[] args) {
		int[] num = {6,3,4,5,12};
//		Arrays.parallelSort(num);
//		System.out.println("최솟값:"+num[0]);
//		System.out.println("최댓값:"+num[4]);
		
		int min = num[0];
		int max = num[0];
		
		for(int i = 1;i<num.length;i++) {
			//최소
			if(min>num[i]) {
				min = num[i];
				
			}
			//최대
			if(max<num[i]) {
				max = num[i];
			}
			
			
		}
		System.out.println(min);
		System.out.println(max);
		
	}
}
