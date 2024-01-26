package ch05.array04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {

		String[] names = {"홍길동", "조수연","북한산","고봉산"};
		System.out.println(Arrays.toString(names));
		for(int i = 0; i<names.length;i++) {
			System.out.println(names[i]+"");
			
		}
		System.out.println();
		
	}

}
