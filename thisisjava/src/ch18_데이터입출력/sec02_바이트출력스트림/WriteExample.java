package ch18_데이터입출력.sec02_바이트출력스트림;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			OutputStream os = new FileOutputStream("C:\\ThisisJavaSecondEdition/test1.db");
//			
//			byte a = 10;
//			byte b = 20;
//			byte c = 30;
//			
//			os.write(a);
//			os.write(b);
//			os.write(c);
//			
//			os.flush();
//			os.close();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		/*
		 * OutputStream os = null; try { os = new
		 * FileOutputStream("C:\\ThisisJavaSecondEdition/test1.db");
		 * 
		 * byte a = 10; byte b = 20; byte c = 30;
		 * 
		 * os.write(a); os.write(b); os.write(c);
		 * 
		 * os.flush(); System.out.println("저장 성공");
		 * 
		 * } catch (Exception e) { e.printStackTrace(); } finally { try { os.close(); }
		 * catch (Exception e) { e.getMessage(); } }
		 */
		
		/*
		 * //--오토클로저블 try(OutputStream os = new
		 * FileOutputStream("C:\\ThisisJavaSecondEdition/test1.db", false)) { byte a =
		 * 10; byte b = 20; byte c = 30;
		 * 
		 * os.write(a); os.write(b); os.write(c);
		 * 
		 * os.flush(); System.out.println("저장 성공");
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		
		// --배열 입출력
		try(OutputStream os = new FileOutputStream("C:\\ThisisJavaSecondEdition/test2.db", false)) {
			byte[] array = {10, 20, 30, 40};
			
//			os.write(array);
			
			//1번 인덱스부터 3개 까지만 출력
			os.write(array, 1, 3);
			
			os.flush();
			System.out.println("저장 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
