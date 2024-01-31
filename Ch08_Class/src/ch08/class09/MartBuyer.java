package ch08.class09;


public class MartBuyer {

	private int money; //구매자가 낸 돈
	private int numOfPear;// 구매자가 구매한 배의 개수
	
	public MartBuyer(int money) {
		this.money = money;
		this.numOfPear = 0;
	}
	public void buyApple(MartSeller seller, int money) {
		//this.numOfApple += seller.saleApple(money);
		this.money -= money;
	}
	public void showBuyResult() {
		System.out.println("****과일 구매자의 현재 상황***");
		System.out.println("현재 잔액: "+money);
		System.out.println("사과 개수"+numOfPear);
	}
	
}
