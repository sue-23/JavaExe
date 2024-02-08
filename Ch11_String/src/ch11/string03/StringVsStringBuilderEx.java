package ch11.string03;


/*
 * https://12bme.tistory.com/42
 * 
 * 
 * String: immutable(불변)
 * StringBuilder : mutable(변함)
 * StringBuffer : mutable(변함). 멀트스레드 동기화 처리
 */



public class StringVsStringBuilderEx {

	public static long getStringSpeed() {
		
		String str = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i<26;i++) {
			str += (char)('a'+i);
		}
		long end = System.currentTimeMillis();
		System.out.println("String: \t"+str);
		
		return end-start;
	}
	public static long getStringBuilderSpeed() {
		StringBuilder strBuilder = new StringBuilder(26);
		long start = System.currentTimeMillis();

		for(int i = 0; i<26;i++) {
			strBuilder.append((char)('a'+i));
		}
		long end = System.currentTimeMillis();

		System.out.println("String: \t"+strBuilder.toString());
		
		
		return end-start;
	}
	
	public static void main(String[] args) {
		getStringBuilderSpeed();
		getStringSpeed();
		
		long strMillis = getStringSpeed();
		long strBuilderMillis = getStringBuilderSpeed();
		System.out.println("String time:" +strMillis);
		System.out.println("StringBuilder Time:"+strBuilderMillis);
		
	}
}
