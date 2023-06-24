package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		// 열거 값 대입
		today = Week.THURSDAY;
		
		
		
		// 컴퓨터의 요일
		Calendar now = Calendar.getInstance();
		int week = now.get(Calendar.DAY_OF_WEEK);
						
		switch(week) {
		case 1 -> today = Week.SUNDAY;
		case 2 -> today = Week.MONDAY;
		case 3 -> today = Week.TUESDAY;
		case 4 -> today = Week.WEDNEDAY;
		case 5 -> today = Week.THURSDAY;
		case 6 -> today = Week.FRIDAY;
		case 7 -> today = Week.SATURDAY;
		}
		
		// 열거 값 비교
		if(today != Week.FRIDAY) {
			System.out.println("금요일이 아니다.");
		} else {
			System.out.println("오늘은 금요일이다.");
		}
	}

}
