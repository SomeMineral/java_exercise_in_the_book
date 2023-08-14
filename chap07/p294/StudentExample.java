package p294;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("gil-dong", "123456-1234567",1);
		System.out.println("name: " + student.name);
		System.out.println("ssn: " + student.ssn);
		
		System.out.println("studentNo : " + student.studentNo);
		System.out.println(student.getClass().getName());
	}
}
