package ch17_스트림.sec01_스트림이란;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("김길동");
		set.add("김자바");
		
		//외부 반복자. set 위치에는 iterable을 구현한 객체가 올 수 있다.
		for(String item : set) {
			System.out.println(item);
		}
		
		System.out.println();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
		
		System.out.println();
		
		//내부 반복자 이용, 스트림 사용. 스트림은 한번 사용하면 재사용 불가, 다시 생성해야함
		Stream<String> stream = set.stream();
		//람다식
		stream.forEach((t) -> {
			System.out.println(t);
		});
	}

}
