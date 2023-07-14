package ch15_컬렉션프레임워크.sec5_Tree.Comparable_Comparator;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		//Comparable 인터페이스의 compareTo 메소드를 어떻게 오버라이드 했는지에 따라 오름차순, 내림차순으로 정렬된다.
		for(Person person : treeSet) {
			System.out.println(person.name + " : "+person.age);
		}
	}

}
