package mata;


public class Employee {
	
	int id;
	String name;
	int salary;
	String dept;
	String address;
	public Employee(int id, String name, int salary, String dept, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.address = address;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + ", address="
				+ address + "]";
	}
	
	
	
	

}