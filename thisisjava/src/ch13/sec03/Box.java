package ch13.sec03;

public class Box<A> {
	private A a;
	
	public A get() {
		return a;
	}
	
	public void set(A a) {
		this.a = a;
	}
}
