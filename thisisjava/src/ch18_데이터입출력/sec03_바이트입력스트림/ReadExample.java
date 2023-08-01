package ch18_데이터입출력.sec03_바이트입력스트림;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * try(InputStream is = new
		 * FileInputStream("C:\\ThisisJavaSecondEdition/test1.db")) { while(true) { int
		 * data = is.read();
		 * 
		 * if(data == -1) break; System.out.println(data); } } catch(Exception e) {
		 * e.printStackTrace(); }
		 */
		
		try(InputStream is = new FileInputStream("C:\\ThisisJavaSecondEdition/test1.db")) {
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data);
				
				if(num == -1) break;
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
