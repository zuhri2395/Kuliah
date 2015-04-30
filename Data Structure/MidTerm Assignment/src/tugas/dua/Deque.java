/**
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 * 
 */
package tugas.dua;

public class Deque {
	private int maxSize, front, rear, nItems;
	private long[] queArray;

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
			/*if (front == -1) {
				front = (maxSize - 1);
			}
			front--;
			queArray[front] = input;
			nItems++;*/
			
	
			if(front == 0 && nItems == 0) {
				queArray[front] = input;
				nItems++;
				front = maxSize;
			} else {
				front--;
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
			/*
			 if(nItems == 0) {
			 	front = rear = 0;
			 }
			 */
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

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return nItems == 0;
	}

	public boolean isFull() {
		return nItems == maxSize;
	}

	public int size() {
		return nItems;
	}
}
