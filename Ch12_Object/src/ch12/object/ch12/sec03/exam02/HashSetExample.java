package ch12.object.ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		Student s1 = new Student(1,"sue");
		hashSet.add(s1);
		System.out.println("저장된 객체 수"+hashSet.size());
		
		Student s2 = new Student(1,"sue");
		hashSet.add(s2);
		System.out.println("저장된 객체 수"+hashSet.size());
		
		Student s3 = new Student(3,"sue");
		hashSet.add(s3);
		System.out.println("저장된 객체 수"+hashSet.size());
		
	}
}
