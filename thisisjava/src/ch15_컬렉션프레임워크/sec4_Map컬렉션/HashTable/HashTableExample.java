package ch15_컬렉션프레임워크.sec4_Map컬렉션.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HashMap를 넣으면 1966개, Hashtable을 넣으면 2000개. 동기화 때문에 생기는 차이로 생각됨.
		Map<String, Integer> map = new Hashtable<>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i),  i);
				}
			}
		};

		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i),  i);
				}
			}
		};

		threadA.start();
		threadB.start();

		// 메인 스레드가 작업 스레드가 종료될 때까지 기다림.
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {

		}

		// 저장된 총 객체 수 얻기
		int size = map.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
	}
}
