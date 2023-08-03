package ch18_데이터입출력.sec11_File과Files클래스;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data = "" + 
					"id: winter\n" +
					"email: winter@mycompany.com\n" +
					"tel: 010-123-4567";
			
			Path path = Paths.get("C:/Temp/user.txt");
			
			Files.writeString(path, data, Charset.forName("UTF-8"));
			
			System.out.println("파일 유형 : " + Files.probeContentType(path));
			System.out.println("파일 크기 : " + Files.size(path) + " bytes");
			
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
