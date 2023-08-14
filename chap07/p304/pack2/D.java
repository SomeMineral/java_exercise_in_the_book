package p304.pack2;
import p304.pack1.A;

public class D extends A{
	public D() {
		super(); // different package but extend
		this.field = "value"; // different package but extend
		this.method(); // different package but extend
	}
	
}
