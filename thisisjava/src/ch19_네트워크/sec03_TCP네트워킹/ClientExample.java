package ch19_네트워크.sec03_TCP네트워킹;

import java.io.IOException;
import java.net.Socket;

public class ClientExample {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localHost", 50001);
			System.out.println("클라이언트 연결 성공");
			
			socket.close();
			System.out.println("클라이언트 연결 해제");
		} catch (IOException e) {
			// IP 또는 Port 번호가 존재하지 않을 경우 
			System.out.println(e.toString());
		}
	}

}
