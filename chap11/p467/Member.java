package p467;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			//cloned = (Member) clone(); // hmm... x = x.clone() 형태가 아니넹.. 이 부분 설명이 없엉.. this.clone() 쓸 줄 알았어.
			cloned = (Member) this.clone(); // 얼레..? 되..네?
		} catch(CloneNotSupportedException e) {}
		return cloned;
	}
}
