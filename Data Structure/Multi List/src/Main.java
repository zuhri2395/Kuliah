
public class Main {
    public static void main(String[] args) {
	Employee emp1 = new Employee(1, "Employee 1", "Semarang", 2000000);
	emp1.next = new Employee(2, "Employee 2", "Kendal", 2500000);
	emp1.next.next = new Employee(3, "Employee 3", "Ungaran", 1500000);
	
	emp1.kids = new Kids("Ahmad", 10, 1);
	emp1.kids.next = new Kids("Intan", 5, 1);
	emp1.next.kids = new Kids("Lia", 20, 1);
	
	//Show all kids of particular employee
	Kids temp = emp1.next.kids;
	while(temp != null) {
	    System.out.println("The name of the kids " + temp.name);
	    temp = temp.next;
	}
	System.out.println("==================================================");
	
	Project proj1 = new Project("Building A", true);
	proj1 = new Project("Building A", true);
	proj1.next = new Project("Building B", false);
	proj1.next.next = new Project("Building C", false);
	proj1.next.next.next = new Project("Building D", true);
	proj1.next.next.next.next = new Project("Building E", true);
	proj1.next.next.next.next.next = new Project("Building G", true);
	
	proj1.supervisor = emp1;
	proj1.next.supervisor = emp1.next;
	proj1.next.next.supervisor = emp1;
	proj1.next.next.next.supervisor = emp1.next.next;
	proj1.next.next.next.next.supervisor = emp1.next;
	proj1.next.next.next.next.next.supervisor = emp1.next.next;
	
	Project tempProject = proj1;
	while (tempProject != null) {
	    if (tempProject.done == true && tempProject.supervisor == emp1) {
		System.out.println("Supervisor " + tempProject.supervisor.name + " create " + tempProject.pName);
	    }
	    tempProject = tempProject.next;
	}
    }
}
