package p637;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors() );
		
		System.out.println("[ task processing request ]"); // 구글 만세
		Callable<Integer> task = new Callable<Integer>() { // 익명?
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for (int i=1; i<=10; i++) {
					sum += i;
				}
				return sum;
			}
		};
		
		Future<Integer> future = executorService.submit(task);
		
		
		try {
			int sum = future.get();
			System.out.println("[ result ] " + sum);
			System.out.println("[ task processing complete ]");
		} catch (Exception e) {
			System.out.println("[ Exception occurs ] " + e.getMessage());
		}
		executorService.shutdown();
	}
}
