/**
 * This class is an answer for Project 4.1
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package tugas;

import tugas.satu.Queue;
import tugas.dua.Deque;
import tugas.tiga.Stack;

public class Main {
	public static void main(String[] args) {
		Queue q = new Queue(5);
		Deque de = new Deque(5);
		Stack st = new Stack(5);
		
		/*
		 * QUEUE (Project 4.1)
		 */
		System.out.print("Queue content : ");
		q.insert(10);
		q.insert(20);
		q.insert(30);
		q.insert(40);
		
		q.remove();
		q.remove();
		q.remove();
		
		q.insert(50);
		q.insert(60);
		q.insert(70);
		q.insert(80);
		
		q.show();
		
		/*
		 * DEQUE (Project 4.2)
		 */
		de.insertLeft(10);
		de.insertLeft(20);
		de.insertRight(30);
		de.insertRight(40);
		de.insertRight(50);
		
		System.out.print("Deque content : ");
		System.out.print(de.removeLeft() + " ");
		System.out.println(de.removeRight() + " ");
		
		/*
		 * STACK (Project 4.3)
		 */
		 st.push(10);
	     st.push(20);
	     st.push(30);
	     st.push(40);
	     st.push(50);
	        
	     st.popBottom();
	     st.popTop();
	     
	     System.out.print("Stack content from bottom : ");
	     st.showFromBottom();
	     
	     System.out.print("\nStack content from top : ");
	     st.showFromTop();

	}
}
