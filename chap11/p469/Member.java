package p469;

import java.util.Arrays;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// first, shallow copy
		Member cloned = (Member) super.clone(); //ah... Member의 clone()을 재정의하고 있었지...this.clone()쓰면 어처구니 없는 상황이..
		
		// copy scores (array) deeply
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		
		// copy car (class) deeply
		cloned.car = new Car(this.car.model);
		
		// return deeply copied Member
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			//cloned = (Member) clone();
			cloned = (Member) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
