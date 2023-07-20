package ch17_스트림.sec3_중간처리와최종처리;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//list.of 를 사용할 수도 있음
		List<Student> list = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
		
		double avg = list.stream().mapToInt(student -> student.getScore())
				.average().getAsDouble();
		
		System.out.println("평균 : "+avg);
		
		System.out.println();
		
		list.stream().map( student -> student.getName())
			.forEach(name -> System.out.println(name));
	}

}
