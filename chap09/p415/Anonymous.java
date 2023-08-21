package p415;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 1;
		int var2 = 10;
		
		field = 100;
		
		//arg1 = 2;
		//arg2 = 22;
		
		//var1 = 222;
		//var2 = 2222; // var2엔 final 안 붙였으나... 마찬가지
		
		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
		
		
	}
}
