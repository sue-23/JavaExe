package ch03.for10;

public class Resolve7 {

	public static void main(String[] args) {
		int i = 1;
		int hap = 0;
		
		do {
			hap +=i;
			i++;	//증가(변화)
			
		}while(i<=10);//조건(언제까지)
		System.out.println(hap);
	}
}
