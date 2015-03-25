
public class array {
	private int marks[];
	private String names[];
	
	public void arrayDeclaration(int arrSize) {
		marks = new int[arrSize];
		names = new String[arrSize];
	}
	
	public void setMark(int index, int value) {
		if(index < marks.length) {
			marks[index] = value;
		} else {
			System.out.println("Index out of range");
		}
	}
	
	public void setName(int index, int value) {
		
	}
	
	public int getMark(int index) {
		
	}
	
	public String getName(int index) {
		return
	}
}
