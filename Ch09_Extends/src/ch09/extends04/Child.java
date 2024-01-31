package ch09.extends04;

public class Child extends Father {

	float day = 365 + 1.0f / 4;

	Child() {
		System.out.println("Child 생성자");
	}

	Child(int score, long money, float day) {
		super(score, money); // fater의 매개변수 생성자 호출

		System.out.println("Child 매개변수 생성자");
	}

	void play() {
		System.out.println("happy");
	}

}
