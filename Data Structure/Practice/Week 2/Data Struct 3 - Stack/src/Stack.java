/**
 * 
 * @author Toshiba
 *
 */
public class Stack {
	
	int data[] = new int[10];
	int top = -1;
	
	public void push(int val) {
		if(top < (10-1)) {
			top++;
			data[top] = val;
		} else {
			System.out.println("Stack is fun");
		}
	}
	
	public int pop() {
		if(top > -1) {
			int result = data[top];
			top--;
			return result;
		} else {
			System.out.println("Stack is empty");
			return 0;
		}
	}
	
	public void printAll() {
		for(int i = 0; i <= top; i++) {
			System.out.println(data[i]);
		}
	}
}
