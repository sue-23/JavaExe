package ch04.reference;

import java.util.Arrays;

public class RefTypeEx {

	public static void main(String[] args) {

		//class => Reference Type
		
		//관습
		int[] arr = { 10, 20, 30 }; //배열 class
		String name = "sue"; //String class
		
		//정식 ->클래스 문법에 따라 할당
		int[] arr1 = new int[3];
		arr1[0] =1;
		arr1[1]=2; 
		arr1[2]=3;
		String name1 = new String("suesue");

		System.out.println(Arrays.toString(arr));
		System.out.println(name);
		System.out.println(Arrays.toString(arr1));
		System.out.println(name1);
		
		System.out.println();
		 
		//힙에 저장되어있는 공간번호??->hashcode
		System.out.println(arr.hashCode());
		System.out.println(name.hashCode());
		System.out.println(arr1.hashCode());
		System.out.println(name1.hashCode());
	}

}
