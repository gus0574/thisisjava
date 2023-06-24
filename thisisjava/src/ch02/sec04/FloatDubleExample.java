package ch02.sec04;

public class FloatDubleExample {
	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.1234567890123456789F;
		double var2 = 0.1234567890123456789;
		System.out.println("var1: "+var1+" var2: "+var2);
		
		double var3 = 3e6;
		float var4 = 3e6F;
		System.out.println("var3: "+var3+" var4: "+var4);
	}
}
