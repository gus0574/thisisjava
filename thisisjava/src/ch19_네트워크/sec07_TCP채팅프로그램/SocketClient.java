package ch19_네트워크.sec07_TCP채팅프로그램;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	//필드
	ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIp;
	String chatName;
	
	//생성자
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			//getHostName 메소드를 사용하기 위해서 캐스팅
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostName();
			receive();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	클라이언트의 메시지 송신
	public void send(String json) {
		try {
			dos.writeUTF(json);
			//재사용을 위해 flush 까지만 
			dos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 클라이언트가 보낸 메시지 수신
	public void receive() {
		chatServer.threadPool.execute(() -> {
			try {
				while(true) {
					// {"command": "~~~", ...}
					String receiveJson = dis.readUTF();
					
					//파싱
					JSONObject jsonObject = new JSONObject(receiveJson);
					String command = jsonObject.getString("command");
					
					switch(command){
						//입장 메시지를 출력하고, chatRoom 해쉬맵에 등록한다
						case "incoming":
							this.chatName = jsonObject.getString("data");
							//여기서 this 는 SocketClient를 의미
							chatServer.sendToAll(this, " 님이 들어오셨습니다.");
							chatServer.addSocketClient(this);
							break;
						case "message":
							String message = jsonObject.getString("data");
							chatServer.sendToAll(this, message);
							break;
					}
				}
			} catch (IOException e) {
				// 연결이 끊겼을 때 처리
				chatServer.sendToAll(this, "님의 연결이 끊겼습니다.");
				chatServer.removeSocketClient(this);
			}
		});
	}
	
	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
