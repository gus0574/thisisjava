package ch13.sec03;

public class 제네릭메소드실행예제 {
	
	public static <A> Box<A> boxing(A a){
		Box<A> box = new Box<>();
		box.set(a);
		return box;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("안녕하세요");
		String str = box2.get();
		System.out.println(str);
	}

}
