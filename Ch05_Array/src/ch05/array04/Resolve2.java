package ch05.array04;
//2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요

import java.util.Arrays;

public class Resolve2 {
	
	public static void method1() {
		String[] names = { "슈", "셰", "쥬", "벨", "정", "사", "더", "엔", "테", "진" };

		for(int i = 0;i<names.length;i++) {
			System.out.println(names[names.length-1-i]+",");
			
		}
		
	}
	public static void method2() {
		String[] names = { "슈", "셰", "쥬", "벨", "정", "사", "더", "엔", "테", "진" };
		String[] cnames = new String[10];
		for (int k = 0; k < cnames.length; k++) {
			cnames[k] = names[9 - k];
		}
		System.out.println(Arrays.toString(cnames));

	}
	public static void method3() {
		String[] names = { "슈", "셰", "쥬", "벨", "정", "사", "더", "엔", "테", "진" };
		
		for (int k = names.length-1; k>0; k--) {
			names[k] = names[k];
		}
		System.out.println(Arrays.toString(names));

	}
	
	public static void main(String[] args) {
		

		//method1();
		method2();
//		method3();
	}

}
