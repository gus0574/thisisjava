package ch14.스레드풀_callable구현객체;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=1; i<=100; i++) {
			final int idx = i;
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				@Override
				public Integer call() throws Exception {
					// TODO Auto-generated method stub
					int sum = 0;
					for(int i=1; i<=idx; i++) {
						sum += i;
					}
					Thread thread = Thread.currentThread();
					System.out.println("["+thread.getName()+"] 1~"+idx+" 합 계산");
					return sum;
				}
			});
			
			try {
				//get으로 callable가 리턴한 값을 다시 리턴해준다. 이때 일시정지 상태가 되는데, 스레드가 완료되어 값이 리턴되면 실행된다.
				int result = future.get();
				System.out.println("\t리턴값: "+result);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		executorService.shutdown();
	}
}
