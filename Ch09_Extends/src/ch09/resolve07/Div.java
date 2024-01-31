package ch09.resolve07;

public class Div {
int a, b;
	
	public Div(){
		
	}
	public void setValue(int _a, int _b) {
		a = _a;
		b = _b;
		
	}
	public Double calculate() {
		
		Double answer = (double) (a/b);
		
		return answer;
	}

}
