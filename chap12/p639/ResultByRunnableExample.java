package p639;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ResultByRunnableExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors() );
		
		System.out.println("[ task processing request ]");
		
		class Task implements Runnable {
			Result result;
			Task(Result result){
				this.result = result;
			}
			@Override
			public void run() {
				int sum = 0;
				for (int i=0; i<=5; i++) {
					sum += i;
					System.out.println(Thread.currentThread().getName() + " " +sum);
				}
				result.addValue(sum);
			}
		}
		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);
		Future<Result> future1 = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task2, result);
		
		try {
			result = future1.get();
			System.out.println("[ result1 ] " + result.accumValue);
			result = future2.get();
			System.out.println("[ result2 ] " + result.accumValue);
			System.out.println("[ task processing complete ]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[ Exception occured ] " + e.getMessage());
		}
		
		executorService.shutdown();
	}
}

class Result {
	int accumValue;
	synchronized void addValue(int value) {
		accumValue += value;
	}
}