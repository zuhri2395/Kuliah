
public class Employee {
    Employee next;
    Kids kids;
    
    int id, salary;
    String name, contact, address;
    
    public Employee(int id, String name, String address, int salary) {
	this.id = id;
	this.name = name;
	this.address = address;
	this.salary = salary;
    }
}
