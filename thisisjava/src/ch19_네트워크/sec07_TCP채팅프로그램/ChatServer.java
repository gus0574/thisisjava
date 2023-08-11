package ch19_네트워크.sec07_TCP채팅프로그램;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	// 필드
	ServerSocket serverSocket;
	ExecutorService threadPool = Executors.newFixedThreadPool(100);
	// 멀티스레드 환경에서 사용할 동기화된 객체나 HashTable 사용
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

	public void start() throws IOException {
		// 포트번호할당
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작");

		Thread thread = new Thread(() -> {
			try {
				// 클라이언트의 요청을 받아들인 정보를 바탕으로 소켓 생성 클라이언트와 1:1 대응하는 소켓 
				// 클라이언트의 요청을 소켓 객체로 객체화 한다.
				while (true) {
					Socket socket = serverSocket.accept();
					SocketClient sc = new SocketClient(this, socket);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		thread.start();
	}

	// 메소드 : 클라이언트 연결 시 SocketClient를 chatRoom에 생성 및 추가
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.put(key, socketClient);
		System.out.println("입장: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
	}

	// 메소드 : 클라이언트 연결 종료 시 SocketClient를 chatRoom에 제거
	public void removeSocketClient(SocketClient socketClient) {
		String key = socketClient.chatName + "@" + socketClient.clientIp;
		chatRoom.remove(key);
		System.out.println("나감: " + key);
		System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
	}

	public void sendToAll(SocketClient sender, String message) {
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.clientIp);
		root.put("chatName", sender.chatName);
		root.put("message", message);
		String json = root.toString();

		// 모든 클라이언트 목록 가져오기, List와 Set가 Collection 인터페이스를 상속받았다
		// chatRoom.values 는 챗룸의 키와 값중 값을 가져오는 메소드
		Collection<SocketClient> socketClients = chatRoom.values();
		for (SocketClient sc : socketClients) {
			if (sc == sender)
				continue;
			sc.send(json);
		}
	}

	public void stop() {
		try {
			serverSocket.close();
			threadPool.shutdownNow();
			// 클라이언트와 통신하고 있는 소켓을 모두 닫아줘야한다.
			// 내부반복자 람다식 사용
			chatRoom.values().stream().forEach(sc -> sc.close());
			System.out.println("[서버] 종료");
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		try {

			ChatServer chatServer = new ChatServer();
			chatServer.start();

			System.out.println("===========");
			System.out.println("서버를 종료하려면 q 입력");
			System.out.println("===========");

			Scanner scanner = new Scanner(System.in);
			while (true) {
				String key = scanner.nextLine();
				if (key.toLowerCase().equals("q"))
					break;
			}
			scanner.close();
			chatServer.stop();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
