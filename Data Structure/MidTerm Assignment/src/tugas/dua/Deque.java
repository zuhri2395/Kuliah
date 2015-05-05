/**
 * This class is an answer for Project 4.2
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package tugas.dua;

import tugas.BasicFunction;

public class Deque extends BasicFunction{
	
	public Deque(int size) {
		maxSize = size;
		queArray = new long[maxSize];
		front = nItems = rear = 0;
	}

	public void insertRight(long input) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			
			if (rear == maxSize - 1) {
				rear = -1;
			}
			rear++;
			queArray[rear] = input;
			
			nItems++;
		}
	}

	
	public void insertLeft(long input) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if(front == 0 && nItems == 0) {
				queArray[front] = input;
				nItems++;
				front = maxSize;
			} else {
				front--;
				if(front == -1) {
					front = maxSize-1;
				}
				queArray[front] = input;
				nItems++;
			}
		}
	}

	public long removeLeft() {
		if (isEmpty()) {
			System.out.println("Queue is already empty");
			return 0;
		} else {
			long temp = queArray[front];
			front++;

			if (front == maxSize) {
				front = 0;
			}

			nItems--;
			return temp;
		}
	}
	
	public long removeRight() {
		if (isEmpty()) {
			System.out.println("Queue is already empty");
			return 0;
		} else {
			long temp = queArray[rear];
			rear--;

			if (rear == -1) {
				rear = (maxSize - 1);
			}

			nItems--;
			return temp;
		}
	}
}
