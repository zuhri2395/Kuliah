/**
 * 
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package tugas.satu;

public class Queue {
	private int maxSize, front, rear, nItems;
	private long[] queArray;

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

	public void show() {
		int counter = 0, size = nItems, index = front;

		do {
			if(index == maxSize) {
				index = 0;
			}
			
			System.out.print(queArray[index] + " ");
			index++;
			counter++;
		} while (counter < nItems);
	}
}
