package ch08.class07;

import java.util.Scanner;

public class RestaurantMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant rest = new Restaurant(sc, "1 식당",
				new String[]{"1","2","3"});
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		
		
		Restaurant rest1 = new Restaurant(sc, "2 식당",
				new String[]{"4","5","6"});
		rest1.viewMenu();
		rest1.selectFood();
		rest1.deliveryFood();
		
		
		Restaurant rest2 = new Restaurant(sc, "3 식당",
				new String[]{"7","8","9"});
		rest2.viewMenu();
		rest2.selectFood();
		rest2.deliveryFood();
		
		sc.close();
	}
}
