/**
 * This class hold the same variable and method that used in project 4.1, 4.2, and 4.3
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package tugas;

public class BasicFunction {
	protected int maxSize, front, rear, nItems;
	protected long[] queArray;
	
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
		int counter = 1, index = front;

		do {
			if(index == maxSize) {
				index = 0;
			}
			
			System.out.print(queArray[index] + " ");
			index++;
			counter++;
		} while (counter <= nItems);
	}
}
