package ch05.array08;
//1. 정수 배열 5개를 할당하고
//Arrays.sort를 활용해서 최소값과 최대값을 얻으세요

import java.util.Arrays;

public class Resolve1 {
	
	public static void main(String[] args) {
		int[] num = {2,44,1,0,5};
		Arrays.sort(num); //오름차순 정렬
		
		
		System.out.println("최댓값:"+num[4]);
		System.out.println("최솟값:"+num[0]);
	}
	

}
