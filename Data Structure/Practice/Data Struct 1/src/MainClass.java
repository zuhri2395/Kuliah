
public class MainClass {
	public static void main(String[] args) {
		Math calc = new Math();
		
		int val1 = 10;
		int val2 = 5;
		
		System.out.println(calc.plus(val1, val2));
		System.out.println(calc.minus(val1, val2));
		System.out.println(calc.multiply(val1, val2));
		System.out.println(calc.division(val1, val2));
		System.out.println(calc.power(val1, val2));
	}
}
