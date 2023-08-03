package ch18_데이터입출력.sec10_객체스트림;

import java.io.Serializable;

public class Member implements Serializable{
	private static final long serialVersionUID = -622284561026719240L;
	private String name;
	private String id;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id + " " + name;
	}
}
