package ch09.extends01;

public class ExtendsMain {
	public static void main(String[] args) {
		//child
		Child child = new Child();
		child.wealth();
		child.handsome();
		child.play();
		//Father
		Father father = new Father();
		father.wealth();
		father.handsome();
		//GrandFather
		GrandFather gfather = new GrandFather();
		gfather.handsome();
	}

}
