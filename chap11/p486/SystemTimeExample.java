package p486;

public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();
		
		long sum = 0; // 뭔가 이상하더라... exceed upper bound. not int but long
		for (int i=1; i<= 1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("sum from 1 to 1000000: " + sum);
		System.out.println("it takes " + (time2 - time1) + " nano seconds");
		
		
		long num = 1000000;
		
		long result = (long) ( (num + 1) * num / 2 );
		System.out.println(result);
	}
}
