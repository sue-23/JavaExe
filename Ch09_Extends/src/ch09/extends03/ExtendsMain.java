package ch09.extends03;

public class ExtendsMain {
	public static void main(String[] args) {
		//child
		Child child = new Child();
		child.wealth();
		child.handsome();
		child.play();
		
		System.out.println("잘생김 점수:"+child.handsomeScore);
		System.out.println("돈 점수:"+child.money);
		System.out.println("즐거움 점수:"+child.day);
		
		//Father
		Father father = new Father();
		father.wealth();
		father.handsome();
		//GrandFather
		GrandFather gfather = new GrandFather();
		gfather.handsome();
	}

}
