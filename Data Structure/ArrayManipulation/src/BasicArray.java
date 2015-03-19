/**
 * This is the class that will handle all the method used in Main Program Class
 * @author Muhammad Zuhri Hanifullah, A11.2013.07880, IUP-UDINUS
 *
 */

public class BasicArray {
	
	//Define array variable
	private int marks[];
	private String names[];
	
	//Constructor
	public BasicArray(int arrSize) {
		arrayDeclaration(arrSize);
	}
	
	//Method to determine the size of array
	public void arrayDeclaration(int arrSize) {
		this.marks = new int[arrSize];
		this.names = new String[arrSize];
	}
	
	
	//Method to set a value to marks array
	public void setMark(int index, int newMark) {
		if(newMark >= 0 && newMark <= 100) {
			this.marks[index] = newMark;
		} else {
			//System.out.println("Please input value between 0 - 100");
			this.marks[index] = 0;
		}
	}
	
	//Method to set a value to names array
	public void setName(int index, String newName) {
		this.names[index] = newName;
	}
	
	//Method to get a value from marks array
	public int getMark(int index) {
		return this.marks[index];
	}
	
	//Method to get a value from names array
	public String getNames(int index) {
		return this.names[index];
	}
	
	//Method to determine whether the value of marks array at specified index is null or not
	public boolean markExists(int index) {
		if(this.marks[index] != 0) {
			return true;
		}
		else {
			return false;
		}
	}

	//Method to determine whether the value of names array at specified index is null or not
	public boolean nameExists(int index) {
		if(names[index] != null) {
			return true;
		} else {
			return false;
		}
	}
	
	//Method to find the Maximum value from marks array
	public int findMaxMark(){
		int max = marks[0];
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] > max) {
				max = marks[i];
			}
		}
		return max;
	}
	
	//Method to find the Minimum value from marks array
	public int findMinMark(){
		int min = marks[0];
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] < min) {
				min = marks[i];
			}
		}
		return min;
	}
	
	//Method to fill marks array with random integer between 0 - 100
	public void fullfill() {
		for(int i = 0; i < marks.length; i++) {
			
			/*int random = (int) ((Math.random() * 100 + 1));
			if(marks[i] == 0) {
				marks[i] = random;
			}*/
			
			double random = (Math.random() * 100);
			if(marks[i] == 0) {
				if(random >= 99.5) {
					marks[i] = (int) random + 1;
				}
				else if(random <= 99.5) {
					marks[i] = (int) random;
				}
			}
		}
	}
	
	//Method to print out all the value from marks array
	public void printAll() {
		for(int i = 0; i < marks.length; i++) {
			System.out.println("Marks : " + getMark(i));
		}
	}
}
