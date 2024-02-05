package ch08.class09;

public class FruitMain {

	public static void main(String[] args) {
		// FruitSeller(보유 사과 개수)
		// FruitBuyer(잔액)
		FruitSeller seller = new FruitSeller(100);
		FruitBuyer buyer = new FruitBuyer(10000);

		// 사과 판매전 판매자와 구매자 현황
		seller.showSaleResult();
		buyer.showBuyResult();

		System.out.println();
		seller.saleApple(buyer, 10000);

		// 사과 판매후 판매자와 구매자 현황
		seller.showSaleResult();
		buyer.showBuyResult();

	}
}
