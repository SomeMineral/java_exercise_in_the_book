package p383;

public interface ChildInterface2 extends ParentInterface {
	
	@Override
	public default void method2() {
		System.out.println("ChildInterface2 - [default] method2()");
		
	}
	
	public void method3();
}
