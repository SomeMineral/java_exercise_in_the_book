package ex05;

public class Child extends Parent{
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);//this.name = name; // p293-294 // in Parent, constructor with parameter... -> should write 'super'
		this.studentNo = studentNo;
	}
}
