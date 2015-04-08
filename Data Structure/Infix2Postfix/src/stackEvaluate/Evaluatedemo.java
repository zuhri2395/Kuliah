/**
 * This is the main class to run the application
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package stackEvaluate;
import java.util.Scanner;

public class Evaluatedemo {
    public static void main(String[] args) {
        String choice;
        int result;
        Scanner sc = new Scanner(System.in);
        
        do {
          PostEvaluate post = new PostEvaluate();
          System.out.println(post.Postfix_eval());
            System.out.println("Postfix again   (y/Y)?");
            choice = sc.nextLine();
        } while(choice.equalsIgnoreCase("Y"));
    }
}
