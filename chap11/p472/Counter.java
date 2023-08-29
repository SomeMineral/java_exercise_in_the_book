package p472;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable { // Throwable..?
		System.out.println("execute finalize() of " + no + "object");
	}
}
