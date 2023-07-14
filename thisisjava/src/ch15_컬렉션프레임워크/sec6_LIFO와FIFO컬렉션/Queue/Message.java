package ch15_컬렉션프레임워크.sec6_LIFO와FIFO컬렉션.Queue;

public class Message {
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
