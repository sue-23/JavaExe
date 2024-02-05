package ch08.class09;

public class FruitSeller {

	private int numOfApple;//보유한 사과 개수
	private int saleMoney;//판매 수익
	public final int APPLE_PRICE=100;//사과 가격
	
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	}
	public void saleApple(FruitBuyer buyer,int money) {
		this.numOfApple -= buyer.buyApple(money);
		this.saleMoney += money;
	}
	public void showSaleResult() {
		System.out.println("***과일 판매자의 현재 상황***");
		System.out.println("남은 사과:"+numOfApple);
		System.out.println("판매 수익: " +saleMoney);
	}
}
