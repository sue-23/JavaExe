package ch03.continue11;

//for 문을 이용해서 1-100까지의 정수중 3의 배수 총합 출력
public class Resolve1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =1;i<=100;i++) {
			if(i%3==0) {
				sum += i;
			}
			
		}
		System.out.println(sum);
		
	}

}
