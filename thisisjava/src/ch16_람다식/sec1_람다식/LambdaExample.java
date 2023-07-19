package ch16_람다식.sec1_람다식;

public class LambdaExample {
	public static void main(String[] args) {
		action((x, y) -> {
			int result = x + y;
			System.out.println("result: " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result: " + result);
		});
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		
		calculable.calculate(x, y);
	}
}
