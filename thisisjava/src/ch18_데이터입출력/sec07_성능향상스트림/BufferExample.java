package ch18_데이터입출력.sec07_성능향상스트림;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// 버퍼가 없는 스트림 생성
//			String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
			String originalFilePath1 = "C:/Users/HOME/git/thisisjava/thisisjava/src/ch18_데이터입출력/sec07_성능향상스트림/originalFile1.jpg";
			String copyFilePath1 = "C:/Temp/copyFile1.jpg";
		
			FileInputStream fis1 = new FileInputStream(originalFilePath1);
			FileOutputStream fos1 = new FileOutputStream(copyFilePath1);
		
			// 버퍼가 있는 스트림 생성
//			String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
			String originalFilePath2 = "C:/Users/HOME/git/thisisjava/thisisjava/src/ch18_데이터입출력/sec07_성능향상스트림/originalFile2.jpg";
			String copyFilePath2 = "C:/Temp/copyFile2.jpg";
		
			FileInputStream fis2 = new FileInputStream(originalFilePath2);
			BufferedInputStream bis = new BufferedInputStream(fis2);
			
			FileOutputStream fos2 = new FileOutputStream(copyFilePath2);
			BufferedOutputStream bos = new BufferedOutputStream(fos2);
			
			// 복사 시간 측정
			long noBufferTime = copy(fis1, fos1);
			System.out.println("버퍼 미사용 : \t"+noBufferTime+"ns");
			long BufferTime = copy(bis, bos);
			System.out.println("버퍼 사용 : \t"+BufferTime+"ns");
			
			fis1.close();
			fos1.close();
			bis.close();
			bos.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();
		
		while(true) {
			//의도적으로 느리게 만듦
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		
		long end = System.nanoTime();
		
		return (end-start);
	}

}
