package ch08.class09;

public class MartMain {

	public static void main(String[] args) {
		MartSeller seller = new MartSeller(10);
		MartBuyer buyer = new MartBuyer(5000);

		seller.showSaleResult();
		buyer.showBuyResult();

		buyer.buyApple(seller, 5000);
		//seller.sale(buyer,20000);
		System.out.println();

		seller.showSaleResult();
		buyer.showBuyResult();
		
		

	}
}
