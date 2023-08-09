package p245;

public class Person {
	final String nation = "Korea";
	final String ssn; // final : 빈 상태로 가능. 처음부터 채우든, 나중에 채우든 아무튼 채워넣은 시점에서 고정됨.
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
