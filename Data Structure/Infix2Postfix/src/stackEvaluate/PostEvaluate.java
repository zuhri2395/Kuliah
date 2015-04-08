/**
 * This class handle a function to do a postfix evaluation
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-DINUS
 *
 */

package stackEvaluate;
import java.util.Scanner;

public class PostEvaluate {
    int maxsize=100;
    int stack[]= new int[maxsize];
    int top=-1;
    
    public void push(char val){
        if (top == maxsize-1){
            System.out.println("Stack is full");
        }
        else{
            stack[++top] = val;
        }
    }
    
    public char pop(){
        if(top >-1){
            char result = (char) stack[top];
            top--;
            return result;
        }
        else {
            System.out.println("Stack is empty");
            return 0;
        }
    }
    public int Postfix_eval(){
        int a, b, temp = 0, len;
        char postfix[] =new char [maxsize];
        String input;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Postfix   :");
        input = sc.nextLine();
        for(int i = 0, j = 0; i < input.length();i++){
            postfix[i] = input.charAt(j);
            j++;
        }
        len = input.length();
        
        for(int i = 0; i <len; i++){
            if(postfix[i]<='9' && postfix[i]>='0'){
                push((char) (postfix[i] - 48));
            }
            else{
                a=pop();
                b=pop();
                
            switch(postfix[i]){
                case '+':
                    temp += b+a; break;
                case '-':
                    temp += b-a; break;
                case '*':
                    temp += b*a; break;
                case '/':
                    temp += b/a; break;
                case '%':
                    temp += b%a; break;
                case '^':
                    temp += (int) Math.pow(b, a); break;
            }
                push((char) temp);
            }
        }
        int x = pop();
        return x;
    }
}
