package ch08.class06;

public class HumanMain {
	
	public static void viewInfo(Human human) {
		System.out.println("이름:"+human.getName());
		System.out.println("나이:"+human.getAge());
		System.out.println("점수:"+human.getScore());
	}

	public static void main(String[] args) {
			Human human = new Human();
//			human.name="sue";
//			human.age=24;
//			human.score=4;
			human.setName("sue");
			human.setAge(24);
			human.setScore(4.5);
			
			viewInfo(human);
			/*
			 * 중간에 많은 처리/연산이 있었다.
			 * 그러다 age나 score값의 음수가 들어갔다.
			 */
//			human.age = -10;
//			human.score = -3;
			human.setAge(-10);
			human.setScore(-20);
			viewInfo(human);
			
	}
}
