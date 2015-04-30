/**
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 * 
 */

package tugas;

import tugas.dua.Deque;
import tugas.tiga.Stack;

public class Main {
	public static void main(String[] args) {
		Deque de = new Deque(7);
		
		de.insertLeft(10);
		de.insertLeft(20);
		de.insertLeft(30);
		de.insertLeft(40);
		
		de.insertRight(50);
		de.insertRight(60);
		de.insertRight(70);
		
		System.out.println(de.removeLeft());
		System.out.println(de.removeLeft());
		System.out.println(de.removeLeft());
		System.out.println(de.removeLeft());
		
		System.out.println(de.removeRight());
	}
}
