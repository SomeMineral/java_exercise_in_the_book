package p484;

public class GcExample {
	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = new Employee(3);
		
		System.out.print("final emp ");
		System.out.println(emp.eno);
		System.gc();
	}
}

class Employee{
	public int eno;
	
	public Employee(int eno) {
		this.eno= eno;
		System.out.println("Employee(" + eno + ") is created in memory?");
	}
	
	@Override
	public void finalize() {
		System.out.println("Employee(" + eno + ") is deleted from memory");
	}
}
