package ch16_람다식.sec4_리턴값이있는람다식;

public class Person {
	public void action(Calculable calculable) {
		double result = calculable.calc(10, 4);
		System.out.println("결과 : " + result);
	}
}
