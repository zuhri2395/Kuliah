
public class Main {
    public static void main(String[] args) {
	EmployeeLinkedList empData = new EmployeeLinkedList();
	
	empData.add(new Employee(1, "Andre", "Kudus", 2000000));
	empData.add(new Employee(2, "Lisa", "Semarang", 3000000));
	empData.add(new Employee(3, "Shinta", "Jogja", 2500000));
	empData.add(new Employee(4, "Karno", "Jepara", 1500000));
	empData.add(new Employee(5, "Tomi", "Pati", 2000000));
	empData.add(new Employee(6, "Laras", "Purwodadi", 4000000));
	
	Employee emp = empData.getEmployee(5);
	emp.name = "Tarno";
	emp.address = "Demak";
	empData.show();
    }
}
