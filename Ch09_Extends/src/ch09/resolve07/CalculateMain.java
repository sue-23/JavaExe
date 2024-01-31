package ch09.resolve07;

public class CalculateMain {

	public static void main(String[] args) {
		Add add = new Add();
		add.setValue(5, 2);
		System.out.println(add.calculate());
		
		Sub sub = new Sub();
		sub.setValue(5, 2);
		System.out.println(sub.calculate());
		
		Mul mul = new Mul();
		mul.setValue(5, 2);
		System.out.println(mul.calculate());
		
		Div div = new Div();
		div.setValue(5, 2);
		System.out.println(div.calculate());
		
	}
}
