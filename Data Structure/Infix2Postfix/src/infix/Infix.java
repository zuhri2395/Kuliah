/**
 * 
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package infix;

public class Infix extends Stack{
	private String input, output = "";
	private Stack theStack;
	
	public Infix(String input, int size) {
		super(size);
		this.input = input;
		theStack = new Stack(size);
		for(int i = 0, j = 0; i < this.input.length(); i++ ) {
			theStack.infix[i] = this.input.charAt(j);
			j++;
		}
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
				
			case '*':
			case '/':
				return 4;
				
			case '^':
				return 5;
				
			default :
				return 0;	
		}
	}
	
	public void convert() {
		int len = input.length();
		char ch;
		
		for(int i = 0; i < len; i++) {
			switch(prec(theStack.infix[i])) {
				case 1:
					theStack.push(theStack.infix[i]);
					break;
					
				case 2:
					ch = theStack.pop();
					while(ch != '(') {
						output += ch;
						ch = theStack.pop();
					}
					break;
					
				case 3:
					ch = theStack.pop();
					while (prec(ch) >= 3) {
						output += ch;
						ch = theStack.pop();
					}
					theStack.push(ch);
					theStack.push(theStack.infix[i]);
					break;
					
				case 4:
					ch = theStack.pop();
					while (prec(ch) >= 4) {
						output += ch;
						ch = theStack.pop();
					}
					theStack.push(ch);
					theStack.push(theStack.infix[i]);
					break;
					
				case 5:
					ch = theStack.pop();
					while (prec(ch) == 5) {
						output += ch;
						ch = theStack.pop();
					}
					theStack.push(ch);
					theStack.push(theStack.infix[i]);
					break;
					
				default:
					output += theStack.infix[i];
					break;
			}
		}
		
		result();
	}
	
	public void result() {
		System.out.println("The Postfix Expression is " + output);
	}
}
