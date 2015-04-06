package infix;

public class Infix extends Stack{
	private String input, output;
	private Stack theStack;
	
	public Infix(String input) {
		this.input = input;
		super.size = this.input.length();
	}
	
	public int prec(char symbol) {
		switch(symbol) {
			case '(':
				return 1;
				
			case ')':
				return 2;
				
			case '+':
			case '-':
				return 3;
				
			case '^':
				return 4;
				
			case '*':
			case '/':
				return 5;
				
			default :
				return 0;	
		}
	}
	
	public void convert() {
		int len = input.length();
		for(int i = 0, j = 0; i < len; i++) {
			switch(prec(theStack.infix[i])) {
			case 1:
				
			}
		}
	}
}
