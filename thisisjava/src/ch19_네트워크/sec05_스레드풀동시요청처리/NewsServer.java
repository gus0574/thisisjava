package ch19_네트워크.sec05_스레드풀동시요청처리;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------");
		System.out.println("종료하려면 q 입력");
		System.out.println("---------------");
		
		//UDP 서버 시작
		startServer();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			String key = sc.nextLine();
			if(key.toLowerCase().equals("q")) {
				break;
			}
		}
		sc.close();
		
		//TCP 서버 종료
		stopServer();
	}
	
	public static void startServer() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[서버] UDP 서버 시작");
					while (true) {
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						System.out.println("클라이언트 희망 뉴스 대기");
						datagramSocket.receive(receivePacket);
						
						//작업 큐(스레드풀)에 처리 작업 넣기, Runnable은 함수형 인터페이스이므로 람다식으로 표현 가능
						executorService.execute(() -> {
							try {
								String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(),
										"UTF-8");

								// 클라이언트의 IP와 Port 열기
								SocketAddress socketAddress = receivePacket.getSocketAddress();

								// 10개의 뉴스를 클라이언트로 전송
								for (int i = 1; i <= 10; i++) {
									String data = newsKind + ": 뉴스 " + i;
									byte[] bytes = data.getBytes("UTF-8");
									DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, socketAddress);
									datagramSocket.send(sendPacket);
									Thread.sleep(1000);
								}
							} catch (Exception e) {
								e.printStackTrace();
							}
						});
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		thread.start();
	}
	
	public static void stopServer() {
		datagramSocket.close();
		executorService.shutdownNow();
		System.out.println("[서버] UDP 서버 종료");
	}

}
