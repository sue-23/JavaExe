package ch02.transtype05;

public class TransDataType {

	public static void main(String[] args) {
		int total = 297; //총점
		int stNum = 4; //학생수
		double avg = 0;
		
		System.out.println("총점은" + total + "입니다.");
		System.out.println("평균은" + (total/stNum) +"입니다.");
		
		avg = total/stNum;
		System.out.println("평균은" + avg +"입니다.");
		
		//강제형변환
		/*실수 정수의 연산결과는
		 * 실수의 표현 범위 > 정수 표현범위
		 * 결과값은 실수 자료형으로 나온다.
		 * 
		 */
		avg = (double)total/stNum;
		System.out.println("평균은" + avg +"입니다.");
		
		avg = (double)total/stNum;
		System.out.println("평균은" + (int)avg +"입니다.");
		
		//실수 정수로 변환
		int navg = (int)avg; 
		System.out.println("평균은" + navg +"입니다.");
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch); //문자 유니코드 확인.
		
	}

}
