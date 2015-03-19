public class StudentClass {
	String nim;
	double gpa;
	
	public void setData(String newNim, double newGPA) {
		this.nim = newNim;
		this.gpa = newGPA;
	}
	
	public void printData() {
		System.out.println("This is the data of student");
		System.out.println("===========================");
		System.out.println("NIM : " + this.nim);
		System.out.println("GPA : " + this.gpa);
		System.out.println("===========================");
	}
}
