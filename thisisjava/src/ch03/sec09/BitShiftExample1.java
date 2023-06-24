package ch03.sec09;

public class BitShiftExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3);
		
		//Math.pow는 double 타입으로 반환된다 
		System.out.println(num1+" "+result1+" "+result2);
		System.out.println(Math.pow(3, 4)+" "+ (int) Math.pow(3, 4));
	}

}
