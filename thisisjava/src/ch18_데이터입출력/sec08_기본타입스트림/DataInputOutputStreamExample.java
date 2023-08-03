package ch18_데이터입출력.sec08_기본타입스트림;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(94.4);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(84.4);
		dos.writeInt(2);
		
		dos.flush(); dos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int num = dis.readInt();
			System.out.println(name +" "+ score + " " + num);
		}
		
		dis.close();
	}

}
