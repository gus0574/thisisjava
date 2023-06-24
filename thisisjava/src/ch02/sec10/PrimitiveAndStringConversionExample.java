package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		String a = "11";
		String b = "3.14";
		String c = "true";
		
		int value1 = Integer.parseInt(a);
		double value2 = Double.parseDouble(b);
		boolean value3 = Boolean.parseBoolean(c);
		
		System.out.println(value1+" "+value2+" "+value3);
		
		//정수, 실수, 불린 등 기본 타입 값을 문자열로 변환
		String str1 = String.valueOf(11);
		String str2 = String.valueOf(value2);
		String str3 = String.valueOf(value3);
		
		System.out.println(str1+" "+str2+" "+str3);
	}
}
