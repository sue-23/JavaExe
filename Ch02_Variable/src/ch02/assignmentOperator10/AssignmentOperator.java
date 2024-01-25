package ch02.assignmentOperator10;

public class AssignmentOperator {

	public static void main(String[] args) {

		int num = 0;
		/*
		 * 변수는 =을 기준으로 왼쪽에서는 공간 오른쪽에서는 공간이 들어있는 값의 의미를 갖는다.
		 */
		
		num = num +10;
		System.out.println(num);
		
		num = num +20;
		System.out.println(num);
		
		//축약 num = num + 30;
		num +=30;
		System.out.println(num);
		
	}

}
