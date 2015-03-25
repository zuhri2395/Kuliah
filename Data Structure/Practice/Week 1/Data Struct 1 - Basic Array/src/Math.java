
public class Math {
	public int plus(int val1, int val2) {
		return val1+val2;
	}
	
	public int minus(int val1, int val2) {
		return val1-val2;
	}
	
	public double multiply(int val1, int val2) {
		return val1*val2;
	}
	
	public double division(int val1, int val2){
		return val1/val2;
	}
	
	public double power(int val1, int val2){
		double result = val1;
		for(int i = 0; i < val2; i++) {
			result = result*val1;
		}
		return result;
	}
}
