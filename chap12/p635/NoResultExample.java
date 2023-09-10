package p635;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors() );
		
		System.out.println("[ task processing request ]"); // 구글 만세
		Runnable runnable = new Runnable() { // 익명?
			@Override
			public void run() {
				int sum = 0;
				for (int i=1; i<=10; i++) {
					sum += i;
				}
				System.out.println("[ result ] " + sum);
			}
			
		};
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
			System.out.println("[ task processing complete ]");
		} catch (Exception e) {
			System.out.println("[ Exception occurs ] " + e.getMessage());
		}
		executorService.shutdown();
	}
}
