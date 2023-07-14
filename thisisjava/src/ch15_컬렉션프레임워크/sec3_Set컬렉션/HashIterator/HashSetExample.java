package ch15_컬렉션프레임워크.sec3_Set컬렉션.HashIterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		//저장할 때 순서는 없음
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");
		
		//이터레이터로 객체를 하나씩 가져와서 처리. 해쉬셋 set의 반복자를 가져온다.
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			//JSP를 찾으면 제거
			if(element.equals("JSP")) {
				iterator.remove();
			}
		}
		System.out.println();
		
		//그냥 제거
		set.remove("JDBC");
		
		//iterable을 구현한 것들이 향상된 for 안에 들어올 수 있다.
		for(String element : set) {
			System.out.println(element);
		}
	}

}
