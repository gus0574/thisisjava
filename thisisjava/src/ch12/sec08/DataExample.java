package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1 = new Date();
		System.out.println(date1.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date1));
	}

}
