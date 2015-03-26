/**
 * 
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

public class QueueApp {
	public static void main (String[] args) {
		Queue antri = new Queue(5);
		

		antri.enqueue(10);
		antri.enqueue(20);
		antri.enqueue(40);
		antri.enqueue(80);
		antri.enqueue(90);
		System.out.println("GET : " + antri.dequeue());
		antri.enqueue(60);
		antri.enqueue(65);
		antri.enqueue(70);
		antri.enqueue(60);
		antri.enqueue(65);
		
		antri.show();
	}
}
