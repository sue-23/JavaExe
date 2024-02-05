package ch08.class09;
//1.FruitMain클래스에		
//현재는 buyer.buyApple(seller, 2000); 처럼 프로그래밍되어
//있습니다.
//아래처럼 seller를 중심으로 수정하세요.
//seller.saleApple(buyer, 2000);

public class FruitBuyer {
	
	//FruitSeller 객체 가져와 과일 판매자의 상수값 가져오기
	FruitSeller seller = new FruitSeller(0);
	private final int APPLE_PRICE = seller.APPLE_PRICE ;
	
	//필드
	private int money; //사과 살 돈
	private int numOfApple; //가지고 있는 사과
	
	//생성자
	public FruitBuyer(int money) {
		this.money=money;
		this.numOfApple=0;
	}
	public int buyApple(int money) {
		
		this.numOfApple = money/APPLE_PRICE;
		this.money -= money;
		return numOfApple;
	
	}
	public void showBuyResult() {
		System.out.println("****과일 구매자의 현재 상황****");
		System.out.println("현재 잔액"+money);
		System.out.println("사과 개수"+numOfApple);
	}

}
