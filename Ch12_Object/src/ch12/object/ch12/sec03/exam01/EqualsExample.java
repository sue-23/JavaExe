package ch12.object.ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		Member obj1 = new Member("Blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
			
		}else
		{
			System.out.println("not equals");
		}
		if(obj1.equals(obj3)) {
			System.out.println("equals");
		}else {
			System.out.println("not equals");
		}
	}
}
