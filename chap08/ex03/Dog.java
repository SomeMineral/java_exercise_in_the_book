package ex03;

public class Dog implements Soundable {
	@Override
	public String sound() {
		return new String("bark");
	}
}
