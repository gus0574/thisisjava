package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regNum1 = "9604181234567";
		String regNum2 = "9604182134567";
		
		if(regNum1.charAt(6) == '1') {
			System.out.println("남자");
		} else if(regNum1.charAt(6) == '2') {
			System.out.println("여자");
		}
		
		if(regNum2.charAt(6) == '1') {
			System.out.println("남자");
		} else if(regNum2.charAt(6) == '2') {
			System.out.println("여자");
		}
	}

}
