package ch18_데이터입출력.sec10_객체스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Member member1 = new Member("fall", "단풍");
		Product product1 = new Product("노트북", 150000);
		int[] arr1 = {1, 2, 3, 4};
		
		oos.writeObject(member1);
		oos.writeObject(product1);
		oos.writeObject(arr1);
		
		oos.flush();
		oos.close();
		
		FileInputStream fis = new FileInputStream("C:/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Member member2 = (Member) ois.readObject();
		Product product2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		
		ois.close();
		
		//객체를 출력할 경우 toString 을 호출하기 때문에 객체클래스에 오버라이딩을 해줘야한다. 
		System.out.println(member2);
		System.out.println(product2);
		System.out.println(Arrays.toString(arr2));
	}

}
