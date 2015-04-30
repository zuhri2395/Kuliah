/**
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 * 
 */

package tugas.tiga;

public class Stack {
	private int top, bottom, maxSize, nItems;
	private long[] data;
	
	public Stack(int j) {
		maxSize = j;
		data = new long[maxSize];
		top = bottom = -1;
	}
	
	public void push(long input) {
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			if(bottom > 0) {
				for(int i = 0; i < maxSize; i++) {
					data[i] = data[i+1];
				}
				top++;
				data[top] = input;
				nItems++;
			} else {
				top++;
				data[top] = input;
				nItems++;
			}
		}
	}
	
	public long popTop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		} else {
			long temp = data[top];
			top--;
			nItems--;
			
			if(top == bottom) {
				top = bottom = 0;
			}
			return temp;
		}
	}
	
	public long popBottom() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		} else {
			bottom++;
			long temp = data[bottom];
			nItems--;
			
			if(top == bottom) {
				top = bottom = 0;
			}
			
			return temp;
		}
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}
}
