package p334;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "mammal"; // 포유류 영어로
	}
	
	@Override
	public void sound() {
		System.out.println("bark!");
	}
}
