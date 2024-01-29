package ch05.array08;

import java.util.Arrays;

//정수 배열 5개를 할당하고
//sysout(arrays.toString(numArr))
//출력시 배열의 값 거꾸로 저장

public class Resolve3 {

	public static void main(String[] args) {
		int[] numArr = {1,2,3,4,5};
		int[]numArr1 = new int[5];
		
		for(int i=0;i<numArr.length;i++) {
			
			numArr1[i] = numArr[4-i];
		}
		numArr = numArr1;
		//System.out.println(Arrays.toString(numArr1));
		System.out.println(Arrays.toString(numArr));

		
	}
}
