/**
 * 
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

public class Queue {
	int data[], first = 0, last=0;
	
	public Queue(int arrSize) {
		data = new int[arrSize];
	}
	
	public void enqueue(int a) {
		if(last < data.length) {
			data[last] = a;
			last++;
		}
		
		if(last == first) {
			System.out.println("FULL");
		}
	}
	
	public int dequeue(){
		int temp = data[first];
		if(last != 0) {
			first++;
		}
		
		if(last == data.length) {
			last = 0;
		}
		
		return temp;
	}
	
	public void show(){
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i] + ", ");
		}
	}
}
