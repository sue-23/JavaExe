package ch09.resolve07;

public class CalculateMain {

	public static void main(String[] args) {
		Add add = new Add();
		add.setValue(5, 2);
		System.out.println(add.calculate());
		
	}
}
