package ch18_데이터입출력.sec03_바이트입력스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String originalFileName = "C:\\ThisisJavaSecondEdition/test1.db";
		String copyFileName = "C:\\ThisisJavaSecondEdition/test1Copy.db";
		
		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(copyFileName);
		
		/*
		 * byte[] data = new byte[1024];
		 * 
		 * while(true) { int num = is.read(data);
		 * 
		 * if(num == -1) break;
		 * 
		 * os.write(data, 0, num); }
		 */
		is.transferTo(os);
		
		
		os.flush();
		os.close();
		is.close();
		
		System.out.println("복사 완료");
	}

}
