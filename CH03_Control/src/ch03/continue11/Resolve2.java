package ch03.continue11;

//for문을 이용해서 다음과 같은 실행 결과가 나오는 코드 작성
public class Resolve2 {
	public static void main(String[] args) {
		
		for(int i = 1;i<6;i++) {
			for(int a = 0;a<i;a++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}
