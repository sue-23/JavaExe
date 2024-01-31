package ch08.class09;


public class MartSeller {
	private int numOfPear;//총 사과개수
	private int saleMoney;//판매금액
	final int PRICE=100;//사과가격(상수)
	
	public MartSeller(int num) {
		this.numOfPear=num;
	}
	public int sale(MartBuyer buyer, int money) {
		int num = money/PRICE; //고객이 구매한 사과 개수
		numOfPear-=num; //남은 사과 개수
		saleMoney+=money; //판매 수익
		return num;
		
	}
	public void showSaleResult() {
		System.out.println("***과일 판매자의 현재 상황***");
		System.out.println("남은 배:"+numOfPear);
		System.out.println("판매 수익: " +saleMoney);
	}
	
}
