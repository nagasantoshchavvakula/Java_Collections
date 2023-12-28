//If we add an object of the class that is not implementing the Comparable interface, the ClassCast Exception is raised
package TreeSet;

import java.util.TreeSet;

class Employee{
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class ClassCastExceptionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating objects of the tree set
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		TreeSet<Employee> ts =  new TreeSet<Employee>();  
		  
		// adding the employee objects to   
		// the TreeSet class  
		ts.add(emp1);  
		ts.add(emp2);  
		ts.add(emp3);   
		System.out.println("The program has been executed successfully.");  
	}	

}
/*In the above program, it is required to implement a Comparable interface. It is because the TreeSet maintains the sorting order, 
 * and for doing the sorting the comparison of different objects that are being inserted in the TreeSet is must, 
 * which is accomplished by implementing the Comparable interface.
 */