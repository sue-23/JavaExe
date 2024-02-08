package ch13.sec01;


/*
 *Box<String> box1 = new Box<>();
 *Box<Integer> box2 = new Box<>();
위 처럼 코드를 작성하면 아래처럼 컴파일러는 자동으로 2개의 클래스를 정의하게 된다.
class Box_String{
	public String content;
}
class Box_Integer{
	public Integer content;
}
 */


public class GenericExample {

	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content ="hi";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}
}
