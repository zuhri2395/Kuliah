/**
 * 
 * @author Toshiba
 *
 */
public class Driver {
	public static void main(String[] args) {
		Stack data = new Stack();
		
		data.push(35);
		data.push(100);
		data.push(31);
		data.push(363);
		data.push(90);
		
		data.pop();
		data.pop();
		data.pop();
		
		data.push(54);
		data.push(63);
		data.push(89);
		data.push(24);
		data.push(65);
		
		//data.printAll();
		
		System.out.println(data.top);
	}
}
