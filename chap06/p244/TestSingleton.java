package p244;

public class TestSingleton {
	private static TestSingleton singleton = new TestSingleton(); // private static class-name singleton
	
	private TestSingleton( ) {		
	}
	
	static TestSingleton getInstance() { // static return-type method-name
		return singleton;
	}
	
}
