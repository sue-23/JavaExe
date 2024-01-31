package ch08.class11;

public class WatchTime {
	private int hour, min, sec;
	private String strHour, strMin, strSec;
	private boolean isNum = true;

	public WatchTime(int hour, int min, int sec) {
		System.out.println("this" + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public WatchTime(String strHour, String strMin, String strSec) {
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
	}

	public void viewTime() {

		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);

	}

	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 14, 22);
		System.out.println("wtNum:" + wtNum);
		System.out.printf("wtNum:%x\n", wtNum.hashCode());
		wtNum.viewTime(); //viewTime(wtNum); 컴파일시 내부적으로 이렇게 실행
		
		System.out.println();

		WatchTime wtNum1 = new WatchTime(12, 14, 22);
		System.out.println("wtNum:" + wtNum1);
		System.out.printf("wtNum:%x\n", wtNum1.hashCode());
		wtNum1.viewTime();

	}
}
