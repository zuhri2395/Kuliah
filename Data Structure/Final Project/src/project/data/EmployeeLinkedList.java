package project.data;

public class EmployeeLinkedList {
    Employee first, last, temp;
    
    public boolean isEmpty() {
	return (this.first == null && this.last == null);
    }
    
    public void add(int id, String name, String address, int salary) {
	insert(new Employee(id, name, address, salary));
    }
    
    public void del(int id) {
	if(isEmpty()) {
	    System.out.println("There is no employee data to be deleted");
	} else {
	    temp = first;
	    first = first.next;
	    temp.destroy();
	}
    }
    
    public Employee getEmployee(int id) {
	temp = first;
	while (temp != null) {
	    if (temp.id == id) {
		return temp;
	    }
	    temp = temp.next;
	}
	return null;
    }
    
    public void update(int id, Employee updEmployee) {
	
    }
    
    public void show() {
	temp = first;
	while (this.temp != null) {
	    System.out.println(temp.id + ". " + temp.name + "; " + temp.address + "; " + temp.salary);
	    temp = temp.next;
	}
    }
    
    private void insert(Employee newEmp) {
	if(isEmpty()) {
	    this.first = this.last = newEmp;
	} else {
	    this.last.next = newEmp;
	    this.last = newEmp;
	}
    }
}
