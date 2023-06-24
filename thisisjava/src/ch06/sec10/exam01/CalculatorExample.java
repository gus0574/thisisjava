package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int result1, result2;
		int result3, result4;
//		Calculator ex = new Calculator();
		
		// 경고표시가 나온다
//		result1 = ex.plus(1,2,3,4,5);
//		result2 = ex.minus(1,2,3,4,5);
		
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(ex.pi);
		
		result3 = Calculator.plus(1,2,3,4,5);
		result4 = Calculator.minus(1,2,3,4,5);
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(Calculator.pi);
	}

}
