package ch03.dowhile09;

public class DoWhileEx {
	public static void main(String[] args) {
		//1-10 출력
		//while은 조건을 먼거 검사하고 실행하는 반면
		//do-while은 1번은 무조건 실행후 조건 검사하여 반복 결정.
		
		int i =1;
		do {
			System.out.println(i);
			i++;	
		}while(i<=10);
		
		
	}

}
