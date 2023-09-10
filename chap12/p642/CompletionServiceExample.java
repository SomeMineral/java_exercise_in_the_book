package p642;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;




/*부분적으로 논리가 이어지지 않는 부분이 너무 답답하다.. 후.
* thread pool 만들고,
* completionService에 pool을 등록, 이로써 작업 끝나는대로 연락 받을 수 있음?
* completionService.submit(new Callable(){~}) ..작업 처리 요청? 무슨 의미지.
* 그 다음엔 executorService thread pool에 runnable을 또 실행.. 뭐지! 
* 그 안에 completionService.take() 있고.. 으아.
* @$$@%#&$%^&@ 몰랑.
* 기능만 설명하고 그 안에서 어떤 과정을 거치는지 죄다 생략한 것 같아.
*
*/


public class CompletionServiceExample {
	public static void main(String[] args) {
		
		// 정리
		// thread pool 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors() ); // 현 환경(cpu) 최대 thread
		
		// completion service - 완료되는대로 알려주세영
		CompletionService<Integer> completionService 
		= new ExecutorCompletionService<Integer>(executorService); // thread pool을 때려박기.
		
		System.out.println("[ task processing request ]");
		for (int i=0; i<3; i++) {
			// submit에 이름 없는 Callable 장착
			completionService.submit(new Callable<Integer>() { 
				@Override
				public Integer call() throws Exception {
					int sum = 0;
					for (int i=0; i<=5; i++) {
						sum += i;
						System.out.println(Thread.currentThread().getName() + " " + sum);
					}
					return sum;
				}
			});
		}
		
		System.out.println("[ confirmation of complete task ]");
		
				
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Future<Integer> future = completionService.take();
						int value = future.get();
						System.out.println("[ result ] " + value);
					} catch (Exception e) {
						break;
					}
				}
			}
		});
		
		try {
			Thread.sleep(300);
		} catch(InterruptedException e) {}
		
		// thread pool 종료
		executorService.shutdown();
		System.out.println("end");
		
		// main은 다 끝났는데 그 외의 thread에서 자꾸 동작하느라 끝나질 않네.. 왜! 모르겠다!
	}
}
