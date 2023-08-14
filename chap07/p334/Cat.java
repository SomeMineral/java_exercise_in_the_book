package p334;

public class Cat extends Animal {
	
	public Cat() {
		this.kind = "mammal"; // 포유류 영어로
	}
	
	@Override
	public void sound() {
		System.out.println("meow!");
	}
}
