package ch08.class09;

import java.util.Arrays;

public class ChineseRestaurant {

	//메뉴
	String[] menus = {"짜장","짬뽕","탕수육"};
	

	//메뉴 보여주기
	public void showMenu() {
		for(int i=0;i<menus.length;i++) {
			System.out.println((i+1)+"번째 "+menus[i].toString()+" 나왔습니다.");
		}
		
	}
	
}
