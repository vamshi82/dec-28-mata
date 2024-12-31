package mata;


class Student{
	
	int id;
	String name;
	static String college;
	int fee;
	String dept;
	
	static {
		System.out.println("First  Got Called.....");
	}
	
	
	
	
	public Student(int id, String name, String college, int fee, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.fee = fee;
		this.dept = dept;
		System.out.println("New Student got created ..."+id+"  Name..."+name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", fee=" + fee + ", dept=" + dept
				+ "]";
	}
	
	static void m1() {
		System.out.println("from m1....");
		//m2();
	}
	
	 void m2() {
		System.out.println("from m2.....");
		m1();
		m3();
	}
	
	void m3() {
		System.out.println("from m3.....");
		m2();
	}
	
	
	
	
}

public class Sample {

	public static void main(String[] args) {
		Student ramu1 = new Student(100,"Ramu1","StPters",76000,"CSE");
		Student ramu2 = new Student(101,"Ramu2","StPters",56000,"AI");
		Student ramu3 = new Student(102,"Ramu3","StPetrs",66000,"Mach");
		Student ramu4 = new Student(103,"Ramu4","StPetes",86000,"Mech");
		
		Student.college = "ST PETERS College";
		
		
		Student.m1();
		
		
		
		System.out.println(ramu1);
		System.out.println(ramu2);
		System.out.println(ramu3);
		System.out.println(ramu4);
		
	

	}

}
