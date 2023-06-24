package ch05.sec05;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "960418-1234567";
		
		//.subString(시작위치, 끝위치+1)
		System.out.println(ssn.substring(0,6));
		System.out.println(ssn.substring(7));
	}

}
