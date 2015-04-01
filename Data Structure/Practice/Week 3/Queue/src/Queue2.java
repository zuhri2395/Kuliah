/**
 * 
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */
public class Queue2 extends Queue1{
	int first;
	
	public Queue2() {
		super();
		last = -1;
		first = -1;
	}
	
	public Queue2(int arrSize) {
		super(arrSize);
		last = -1;
		first = -1;
	}
	
	public void enqueue(int input) {
		if(isFull() && first == 0) {
			System.out.println("Queue Full");
		} else {
			if(isEmpty()) {
				first++;
				last++;
				data[last] = input;
			} else {
				if(last == (data.length - 1) && (first != 0)) {
					int idx = 0;
					while(first <= last) {
						data[idx] = data[first];
						idx++;
						first++;
					}
					first = 0;
					last = idx;
					//last++;
					data[last] = input;
				} else {
					last++;
					data[last] = input;
				}
			}
		}
	}
	
	public int dequeue() {
		if(isEmpty() && first == -1) {
			System.out.println("Queue is Empty");
			return 0;
		} else {
			if(first > last) {
				first = last = 0;
			} else {
				int temp = data[first];
				first++;
				return temp;
			}
			return 0;
		}
	}
}
