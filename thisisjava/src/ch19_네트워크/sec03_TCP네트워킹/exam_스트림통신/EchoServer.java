package ch19_네트워크.sec03_TCP네트워킹.exam_스트림통신;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

	//자동으로 null 초기화 됨
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("서버를 종료하려면 q 또는 Q를 입력");
		
		//서버 실행 -- 포트번호를 사용했기에 방화벽 보안 창이 뜬다.
		startServer();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		
		scanner.close();
		
		stopServer();
	}
	
	public static void startServer() {
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//서버소켓 생성 및 포트 바인딩
					serverSocket = new ServerSocket(50001);
					System.out.println("서버 시작");

					//여러 요청을 수락하기 위해 루프문
					while (true) {
						System.out.println("\n서버 연결 요청 대기");
						
						// 연결 수락 -- accept 후 대기상태에서 클라이언트의 요청이 왔을 때 수락됨
						Socket socket = serverSocket.accept();
						
						//연결된 클라이언트의 정보 얻기 -- 클라이언트를 따로 만들지 않기 때문에, 브라우저에서 ip주소:port번호 를 입력하여 테스트 
						InetSocketAddress inet = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("서버: " + inet.getHostString() + " 님의 연결 요청을 수락함.");

						//-------------------------
						//데이터 받기 (보조 스트림 X 버전)
						/*
						 * InputStream is = socket.getInputStream(); byte[] bytes = new byte[1024]; int
						 * num = is.read(bytes); String message = new String(bytes, 0, num, "UTF-8");
						 * 
						 * //데이터 보내기 OutputStream os = socket.getOutputStream(); // 문자열을 바이트배열형식으로
						 * 변환해야하기 때문에 getBytes bytes = message.getBytes("UTF-8"); os.write(bytes);
						 * os.flush(); System.out.println("[서버] 받은 데이터를 회신 함" + message);
						 */
						
						//-------------------------
						//데이터 받기 보조스트림 O 
						DataInputStream dis = new DataInputStream(socket.getInputStream());
						String message = dis.readUTF();
						
						//데이터 보내기
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message);
						dos.flush();
						System.out.println("서버 : 받은 메시지를 다시 보냄 : "+message);
						
						
						//-------------------------
						
						// 연결 끊기
						socket.close();
						System.out.println("서버: " + inet.getHostName() + " 님의 연결을 해제함.");
					}
				} catch (Exception e) {
					e.toString();
					e.printStackTrace();
				}
			}
		};
		
		//스레드 시작
		thread.start();
	}
	
	public static void stopServer() {
		try {
			//ServerSocket 닫고 Port 언바인딩
			serverSocket.close();
			System.out.println("서버 소켓 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
