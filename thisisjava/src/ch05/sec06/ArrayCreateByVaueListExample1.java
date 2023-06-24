package ch05.sec06;

public class ArrayCreateByVaueListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] season = {"Winter", "Fall", "Summer", "Spring"};
		String[] test = null;
		String[] arrayStr = new String[3];	// 각 항목은 null로 초기화됨
		
		for(int i=0; i<season.length; i++) {
			System.out.println(season[i]);
		}
		
		season[1] = "가을";
		
		for(int i=0; i<season.length; i++) {
			System.out.println(season[i]);
		}
		
		//매개변수로 중괄호를 넣으려면 new 타입으로 호출해야한다.
		test = new String[] {"a", "b", "C"};
		
		for(int i=0; i<test.length; i++) {
			System.out.println(test[i]);
		}
		
//		arrayStr = {"ab", "bc", "cd"};
		arrayStr[0] = "ab";
		arrayStr[1] = "bc";
		arrayStr[2] = "cd";
		for(int i=0; i<arrayStr.length; i++) {
			System.out.println(arrayStr[i]);
		}
	}

}
