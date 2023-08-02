package ch18_데이터입출력.sec07_성능향상스트림;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/HOME/git/thisisjava/thisisjava/src/ch18_데이터입출력/sec07_성능향상스트림/BufferExample.java"));
		
		int lineNum = 1;
		
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNum+"\t"+str);
			lineNum++;
		}
		br.close();
	}

}
