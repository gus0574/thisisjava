package ch18_데이터입출력.sec10_객체스트림;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = -621812868470078544L;
	private int price;
	private String id;
	
	public Product(String id, int price) {
		this.id = id;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return id + " " + price;
	}
}
