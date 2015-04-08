/**
 * This is the main class to run the application
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package infix;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the infix expression = ");
		String input = in.nextLine();
		Infix infix = new Infix(input, input.length()+1);
		infix.convert();
	}
}
