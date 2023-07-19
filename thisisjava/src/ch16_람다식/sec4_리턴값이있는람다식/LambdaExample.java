package ch16_람다식.sec4_리턴값이있는람다식;

public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.action((x, y) -> {
			double result = x+y;
			return result;
		});
		
		person.action((x, y) -> x+y);
		
		person.action((x, y) -> sum(x, y));
	}
	
	public static double sum(double x, double y) {
		return (x + y);
	}

}
