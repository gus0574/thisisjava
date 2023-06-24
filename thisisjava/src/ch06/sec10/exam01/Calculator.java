package ch06.sec10.exam01;

public class Calculator {
	static double pi = 3.14159;
	
	static int plus(int ... values) {
		int result = 0;
		for(int i : values) {
			result += i;
		}
		return result;
	}
	
	static int minus(int ... values) {
		int result = 0;
		for(int i : values) {
			result -= i;
		}
		return result;
	}
}
