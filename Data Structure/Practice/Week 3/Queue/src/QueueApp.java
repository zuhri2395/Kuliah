import java.time.LocalTime;

public class QueueApp {
	public static void main(String[] args) {
		int data = 5;
		Queue1 q1 = new Queue1(data);
		Queue2 q2 = new Queue2(data);
		
		System.out.println(LocalTime.now());
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		q1.enqueue(40);
		q1.enqueue(50);
		q1.dequeue();
		System.out.println(LocalTime.now());
		
		System.out.println(LocalTime.now());
		q2.enqueue(10);
		q2.enqueue(20);
		q2.enqueue(30);
		q2.enqueue(40);
		q2.enqueue(50);
		q2.dequeue();
		q2.enqueue(60);
		System.out.println(LocalTime.now());
	}
}
