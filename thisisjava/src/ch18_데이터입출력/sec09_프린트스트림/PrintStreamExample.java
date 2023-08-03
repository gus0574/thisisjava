package ch18_데이터입출력.sec09_프린트스트림;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("예제) ");
		ps.println("프린트가 출력하는 것처럼");
		ps.println("데이터를 출력한다.");
		ps.printf("%6d | %-10s | %10s | \n", 1, "홍길동", "도적");
		ps.printf("%6d | %-10s | %10s | \n", 2, "김자바", "학생");
		
		ps.close();
	}

}
