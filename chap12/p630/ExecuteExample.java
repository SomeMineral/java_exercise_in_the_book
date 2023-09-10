package p630;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2); // # of maximum thread = 2
		for (int i=0; i<10; i++) {
			Runnable runnable = new Runnable() { // 익명? 이었나?
				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[total number of threads: " + poolSize + "] working? thread name: " + threadName);
					
					// exception on purpose (구글링 최고..)
					int value = Integer.parseInt("셋");
					
				}
			};
			//executorService.execute(runnable); // 예외 -> 버림
			executorService.submit(runnable); // 예외 -> 재사용
			
			try{ 
				Thread.sleep(50);// for print
			} catch (InterruptedException e) {}
		}
		
		executorService.shutdown(); // thread pool end
	}
}
