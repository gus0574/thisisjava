package ch03.sec01;

public class SignOperatorExample{
	public static void main(String[] args) {
		byte a = 100;
		//에러 발생, 정수 연산의 결과는 int 타입이기 때문에 
		//byte resule = -a;
		int result = -a;
		System.out.println(result);
	}
}