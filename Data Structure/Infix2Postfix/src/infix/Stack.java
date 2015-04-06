/**
 * 
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package infix;

public class Stack {
	private int top;
	protected int size;
	protected char[] postfix, infix;
	
	public Stack() {
		postfix = new char[size];
		infix = new char[size];
		top = -1;
	}
	
	public boolean isFull() {
		return top == infix.length - 1;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(char symbol) {
		if(isFull()) {
			System.out.println("The Stack is Full");
		} else {
			top++;
			infix[top] = symbol;
		}
	}
	
	public char pop() {
		if(isEmpty()) {
			System.out.println("The Stack is Empty");
			return 0;
		} else {
			char temp = infix[top];
			top--;
			return temp;
		}
	}
}