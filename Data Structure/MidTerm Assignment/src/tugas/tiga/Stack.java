/**
 * This class is an answer for Project 4.3
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package tugas.tiga;

import tugas.BasicFunction;

public class Stack extends BasicFunction{
	private int top, bottom;
	private long[] data;
	
	public Stack(int j) {
		maxSize = j;
		data = new long[maxSize];
		top = -1;
		bottom = 0;
	}
	
	public void push(long input) {
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			top++;
			data[top] = input;
			nItems++;
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
			
			return temp;
		}
	}
	
	public long popBottom() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return 0;
		} else {
			long temp = data[bottom];
			for(int i = 0; i < maxSize-1; i++) {
                data[i] = data[i+1];
			}
			top--;
			nItems--;
			return temp;
		}
	}
	
	public void showFromTop() {
		int counter = 0, index = top;
        do {
            if(index == maxSize) {
                index = 0;
            }
            System.out.print(data[index] + " ");
            index--;
            counter++;
        } while(counter < nItems);
	}
	
	public void showFromBottom() {
		int counter = 0, index = bottom;
        do {
            if(index == maxSize) {
                index = 0;
            }
            System.out.print(data[index] + " ");
            index++;
            counter++;
        } while(counter < nItems);
	}
}
