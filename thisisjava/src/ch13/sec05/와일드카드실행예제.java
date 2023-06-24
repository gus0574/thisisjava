package ch13.sec05;


public class 와일드카드실행예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		와일드카드타입클래스예제2.registerCourse1(new 와일드카드제네릭예제<와일드카드클래스예제1>(new 와일드카드클래스예제1()));
		와일드카드타입클래스예제2.registerCourse1(new 와일드카드제네릭예제<Worker>(new Worker()));
		와일드카드타입클래스예제2.registerCourse1(new 와일드카드제네릭예제<Student>(new Student()));
		와일드카드타입클래스예제2.registerCourse1(new 와일드카드제네릭예제<HighStudent>(new HighStudent()));
		와일드카드타입클래스예제2.registerCourse1(new 와일드카드제네릭예제<MiddleStudent>(new MiddleStudent()));
		System.out.println();
		
		와일드카드타입클래스예제2.registerCourse2(new 와일드카드제네릭예제<Student>(new Student()));
		와일드카드타입클래스예제2.registerCourse2(new 와일드카드제네릭예제<HighStudent>(new HighStudent()));
		와일드카드타입클래스예제2.registerCourse2(new 와일드카드제네릭예제<MiddleStudent>(new MiddleStudent()));
		
		와일드카드타입클래스예제2.registerCourse3(new 와일드카드제네릭예제<Person>(new Person()));
		와일드카드타입클래스예제2.registerCourse3(new 와일드카드제네릭예제<Worker>(new Worker()));
	}

}
