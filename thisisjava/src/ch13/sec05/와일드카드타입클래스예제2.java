package ch13.sec05;

public class 와일드카드타입클래스예제2 {
		//와일드카드 타입은 제네릭 타입을 리턴이나 매개변수에서 사용할때만 가능
		
		//모든 사람이면 등록 가능
		public static void registerCourse1(와일드카드제네릭예제<?> applicant) {
			System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course1을 등록함");
		}
		
		//학생만 등록 가능
		public static void registerCourse2(와일드카드제네릭예제<? extends Student> applicant) {
			System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course2을 등록함");
		}
		
		//학생만 등록 가능
		public static void registerCourse3(와일드카드제네릭예제<? super Worker> applicant) {
			System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3을 등록함");
		}
}
