/**
 * This Class is the Main Program that will do the Array Manipulation
 * and display the output.
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-UDINUS
 *
 */

public class Driver {
	
	public static void main(String[] args) {
		
		//Define an object and the size of array
		BasicArray array = new BasicArray(20);
		
		//Set the value of Name & Mark array
		array.setMark(0, 60);
		array.setName(0, "A");
		array.setMark(1, 75);
		array.setName(1, "B");
		array.setMark(5, 84);
		array.setName(5, "C");
		
		//Print out to the screen the value of Name & Mark array
		System.out.println("Name : " + array.getNames(0));
		System.out.println("Mark : " + array.getMark(0));
		System.out.println("Name : " + array.getNames(1));
		System.out.println("Mark : " + array.getMark(1));
		System.out.println("Name : " + array.getNames(5));
		System.out.println("Mark : " + array.getMark(5));
		
		System.out.print("\n");
		
		//Check whether Name & Mark array is exist or not
		System.out.println("Mark Exist 0 : " + array.markExists(0));
		System.out.println("Name Exist 0 : " + array.nameExists(0));
		System.out.println("Mark Exist 9 : " + array.markExists(9));
		System.out.println("Name Exist 9 : " + array.nameExists(9));
		
		//Fill the empty Mark array with random value
		array.fullfill();
		
		//Print out all the value of Mark array
		array.printAll();
		
		//Define a variable to store max and min value
		int max = array.findMaxMark();
		int min = array.findMinMark();

		System.out.print("\n");
				
		//Print out the max and min value
		System.out.println("MAX : " + max);
		System.out.println("MIN : " + min);
	}

}