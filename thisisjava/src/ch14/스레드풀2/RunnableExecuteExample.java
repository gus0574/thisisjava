package ch14.스레드풀2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고";
		}
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<1000; i++) {
			final int idx = i;
			executorService.execute(new Runnable() { 
				@Override
				public void run() {
					// TODO Auto-generated method stub
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("["+thread.getName()+"]"+from+"==>"+to+": "+content);
				}
			});
		}
		
		executorService.shutdown();
	}
}
