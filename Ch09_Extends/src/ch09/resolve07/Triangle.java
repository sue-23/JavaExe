package ch09.resolve07;
//. 밑변과 높이 정보를 저장할 수 있는 Triangle클래스를 정의합니다
//생성과 동시에 초기화가 가능한 생성자도 정의합니다
//밑변과 높이 정보를 변경시킬 수 있는 메소드를 정의합니다
//삼각형의 넓이를 계산해서 반환하는 메소드도 정의합니다
//객체를 만들어서 사용해보세요

public class Triangle {
	
	//밑변, 높이
	int a, b;
	
	public Triangle() {
		this.a =0;
		this.b = 0;
		
	}
	public void Change(int a, int b) {
		this.a = a;
		this.b = b;
//		System.out.println("변경된 밑변 길이:"+a);
//		System.out.println("변경된 높이 길이"+b);
	}
	public int Calculate(int a, int b) {
		this.a = a;
		this.b = b;
		int result = a*b/2;
		
		return result;
	}

}
