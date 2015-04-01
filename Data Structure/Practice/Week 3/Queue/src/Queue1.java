/**
 * 
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */
public class Queue1 {
	protected int last, data[];
	
	public Queue1() {
		data = new int[10];
		last = -1;
	}
	
	public Queue1 (int arrSize) {
		data = new int[arrSize];
		last = -1;
	}
	
	public void enqueue(int input) {
		if(isFull()) {
			System.out.println("Queue Full");
		} else {
			last++;
			data[last] = input;
		}
	}
	
	public int dequeue() {
		int previdx = 0;
		
		if(isEmpty()){
			System.out.println("Queue Empty");
			return 0;
		} else {
			int temp = data[last];
			while(last < (data.length - 1)) {
				data[previdx] = data[previdx + 1];
				last++;
			}
			last--;
			return temp;
		}
	}
	
	public boolean isFull() {
		return last == (data.length - 1);
	}
	
	public boolean isEmpty() {
		return last == -1;
	}
}
