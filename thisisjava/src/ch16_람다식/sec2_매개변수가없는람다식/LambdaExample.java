package ch16_람다식.sec2_매개변수가없는람다식;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.action(() -> {
			System.out.println("출근");
			System.out.println("일한다.");
		});
		
		person.action(() -> System.out.println("퇴근"));
	}

}
