/**
 * This class is an answer for Project 4.1
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package tugas.satu;

import tugas.BasicFunction;

public class Queue extends BasicFunction{
	
	public Queue(int size) {
		maxSize = size;
		queArray = new long[maxSize];
		front = nItems = 0;
		rear = -1;
	}

	public void insert(long input) {
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

	public long remove() {
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

	public void show() {
		int counter = 0, index = front;

		do {
			if(index == maxSize) {
				index = 0;
			}
			
			System.out.print(queArray[index] + " ");
			index++;
			counter++;
		} while (counter < size());
		System.out.println();
	}
}
