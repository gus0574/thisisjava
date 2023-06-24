package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수배열을 가지고 총합과 평균 구하기
		
		int[] scores;
		scores = new int[] {11, 22, 33, 44, 88};
		int sum = 0;
//		double avg;
		
		for(int score : scores) {
			sum += score;
		}
		System.out.println(sum);
		
		double avg = (double) sum / scores.length;
		System.out.println(avg);
	}

}
