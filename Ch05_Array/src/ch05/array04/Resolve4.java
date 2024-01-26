package ch05.array04;

import java.util.Arrays;

//4. int배열을 10개 생성하세요.
//int배열에 3의 배수를 차례대로 저장하세요.
//그리고 거꾸로 출력하세요
public class Resolve4 {
	public static void main(String[] args) {
		int[] num = new int[10];
		

		for (int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 3;	
		}
		
		//int [] cnum = {num[9],num[8],num[7],num[6],num[5],num[4],num[3],num[2],num[1],num[0]};
		int[] cnum = new int[10];
		for (int k = 0;k<cnum.length;k++) {
			cnum[k] = num[9-k];
		}
		System.out.println(Arrays.toString(cnum));

	}

}
