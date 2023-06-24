package ch13.sec01;

public class 제네릭예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;	//박싱 발생 
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int value = box2.content;
		System.out.println(value);
	}

}
