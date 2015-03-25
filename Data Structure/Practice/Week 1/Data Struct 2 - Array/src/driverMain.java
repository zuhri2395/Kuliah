import java.util.Scanner;

public class driverMain {
	
	public static void main(String[] args) {
		Driver obj = new Driver();
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input the name : ");
		String name = input.nextLine();
		obj.setName(name);
		
		System.out.print("the name of new component class is : ");
		obj.printName();
		
		StudentClass newStudent = new StudentClass();
		System.out.print("Input the NIM: ");
		String data1 = input.nextLine();
		System.out.print("Input the GPA: ");
		double data2 = input.nextDouble();
		
		newStudent.setData(data1, data2);
		newStudent.printData();
	}
}
