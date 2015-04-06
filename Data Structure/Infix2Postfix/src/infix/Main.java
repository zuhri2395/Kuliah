/**
 * 
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package infix;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String input = "1+2*4/5-7+3/6";
		Infix infix = new Infix(input, input.length());
		//Scanner in = new Scanner(System.in);
		
		//System.out.print("Enter the infix expression = ");
		//String input = in.nextLine();
		//String input = "1+2*4/5-7+3/6";
		//infix = new Infix(input, input.length());
		infix.convert();
	}
}
