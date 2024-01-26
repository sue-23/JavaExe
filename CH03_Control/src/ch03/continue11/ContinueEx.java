package ch03.continue11;

public class ContinueEx {

	public static void main(String[] args) {

		for(int i=1;i<=9;i++) {
			System.out.printf("3*%d=%d\n",i,3*i);
		}
		System.out.println();
		
		for(int i=1;i<=9;i++) {
			//i>5일때 반복문으로 아래 실행문을 실행하지 않고 다시 반복문으로 돌아가라.
			if(i>5)
				continue;
			System.out.printf("3*%d=%d\n",i,3*i);
		}
	}

}
