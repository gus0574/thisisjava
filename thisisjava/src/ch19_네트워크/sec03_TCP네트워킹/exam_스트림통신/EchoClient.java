package ch19_네트워크.sec03_TCP네트워킹.exam_스트림통신;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localHost", 50001);
			System.out.println("클라이언트 연결 성공");
			
			//-------------
			/*
			 * String message = "안녕하세요"; byte[] bytes = new byte[1024]; bytes =
			 * message.getBytes("UTF-8"); OutputStream os = socket.getOutputStream();
			 * os.write(bytes); os.flush();
			 * 
			 * InputStream is = socket.getInputStream(); int num = is.read(bytes); message =
			 * new String(bytes, 0, num, "UTF-8"); System.out.println("[클라이언트] 데이터 수신" +
			 * message);
			 */
			//-------------
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			String message = "클라이언트 : 안녕하세요~";
			dos.writeUTF(message);
			dos.flush();
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			message = dis.readUTF();
			System.out.println("클라이언트 : 서버에서 보낸 메시지 받음 " + message);
			
			
			//-------------
			
			socket.close();
			System.out.println("클라이언트 연결 해제");
		} catch (IOException e) {
			// IP 또는 Port 번호가 존재하지 않을 경우 
			System.out.println(e.toString());
		}
	}

}
