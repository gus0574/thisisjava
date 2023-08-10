package ch19_네트워크.sec05_스레드풀동시요청처리;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {
	public static void main(String[] args) {
		try {//클라이언트는 고정 포트가 없어서 자동으로 할당한다
			DatagramSocket datagramSocket = new DatagramSocket();
			
			//구독하고싶은 뉴스 주제 보내기
			String data = "정치";
			byte[] bytes = data.getBytes("UTF-8");
			DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost", 50001));
			datagramSocket.send(sendPacket);
			
			
			//뉴스 받기
			while(true) {
				DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
				datagramSocket.receive(receivePacket);
				
				//문자열로 변환
				String news = new String(receivePacket.getData(), 0, receivePacket.getLength(), "UTF-8");
				System.out.println(news);
				
				//10번째 뉴스를 받으면 종료
				if(news.contains("뉴스 10")) {
					break;
				}
			}
			
			datagramSocket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
