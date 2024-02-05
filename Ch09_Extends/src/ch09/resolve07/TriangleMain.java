package ch09.resolve07;

public class TriangleMain {

	public static void main(String[] args) {
		Triangle tri = new Triangle();
		System.out.println("기존 삼각형 넓이:"+tri.Calculate(3, 2));
		
		tri.Change(4, 2);
		System.out.println("변경 삼각형 넓이:"+tri.Calculate(4, 2));	}
}
