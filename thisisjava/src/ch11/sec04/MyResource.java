package ch11.sec04;

public class MyResource implements AutoCloseable{

	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource : " + this.name + " 열기");
	}
	
	public String read1() {
		System.out.println("MyResource : " + this.name + " 읽기");		
		return "100";
	}
	
	public String read2() {
		System.out.println("MyResource : " + this.name + " 읽기");		
		return "abc";
	}
	
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyResource : " + this.name + " 닫기");
	}
	
}
