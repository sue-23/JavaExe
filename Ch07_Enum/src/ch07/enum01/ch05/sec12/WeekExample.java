package ch07.enum01.ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		Week today=null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1: today = Week.Sunday;	break; 
		case 2: today = Week.Monday;	break; 
		case 3: today = Week.Tuesday;	break; 
		case 4: today = Week.Wendnesday;	break; 
		case 5: today = Week.Thursday;	break; 
		case 6: today = Week.Friday;	break; 
		case 7: today = Week.Saturday;	break; 
		
		
		}
		if(today == Week.Sunday) {
			System.out.println("일요일에는 축구를 함");
		}
		else {
			System.out.println("자바공부함");
		}
	}

}
