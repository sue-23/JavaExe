package ch05.array08;

import java.util.Arrays;

//정수 배열 5개를 할당하고
//arrays.sort없이
//출력시 오름차순 정렬

public class Resolve4 {

	public static void main(String[] args) {
		int[] numArr = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < numArr.length - 1; i++) {
			for (int a = 0; a < numArr.length - 1; a++) {
				if (numArr[a] > numArr[a + 1]) {
					int temp = numArr[a];
					numArr[a] = numArr[a+1];
					numArr[a+1] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(numArr));

	}
}
