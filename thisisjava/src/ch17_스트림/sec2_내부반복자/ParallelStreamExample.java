package ch17_스트림.sec2_내부반복자;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		for(int i=1; i<=100; i++) {
			list.add("홍길동"+i);
		}
		
		//병렬 스트림. -stream()으로 얻으면 싱글 스트림이 된다.
		//병렬처리이기 때문에 코어끼리 나누어서 처리한다.
		Stream<String> stream = list.parallelStream();
		stream.forEach((name) -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}

}
