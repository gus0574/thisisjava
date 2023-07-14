package ch15_컬렉션프레임워크.sec2_List컬렉션;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList를 넣으면 1976개, Vector을 넣으면 2000개. 동기화 때문에 생기는 차이로 생각됨.
//		List<Board> list = new ArrayList<>();
		List<Board> list = new Vector<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		//작업 스레드 객체 생성 
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		//메인 스레드가 작업 스레드가 종료될 때까지 기다림.
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {
			
		}
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : "+size);
		System.out.println();
	}
}
