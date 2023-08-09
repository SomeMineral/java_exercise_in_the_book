package p274;

public class Service {
	@PrintAnnotation
	public void method1() {
		System.out.println("content1");
	}
	
	@PrintAnnotation("*")
	public void method2() {
		System.out.println("content2");
	}
	
	@PrintAnnotation(value = "#", number = 20)
	public void method3() {
		System.out.println("content3");
	}
	
}
