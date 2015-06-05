
public class Project {
    Project next;
    Employee supervisor;
    boolean done;
    String pName;
    
    public Project(String pName, boolean done) {
	this.pName = pName;
	this.done = done;
    }
}
