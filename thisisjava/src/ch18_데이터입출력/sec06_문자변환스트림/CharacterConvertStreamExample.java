package ch18_데이터입출력.sec06_문자변환스트림;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//file에 저장
		write("문자 변환 스트림을 사용합니다.");
		
		//file 읽기
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{
		OutputStream os = new FileOutputStream("C:\\ThisisJavaSecondEdition/test1.db");
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception{
		/*
		 * InputStream is = new FileInputStream("C:\\ThisisJavaSecondEdition/test1.db");
		 * Reader reader = new InputStreamReader(is, "UTF-8");
		 * 
		 * char[] data = new char[100]; int num = reader.read(data); reader.close();
		 * String str = new String(data, 0, num);
		 */
		
		// 보조스트림 추가로 단순화
		InputStream is = new FileInputStream("C:\\ThisisJavaSecondEdition/test1.db");
		Reader reader = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(reader);
		
		String str = br.readLine();
		
		return str;
	}

}
