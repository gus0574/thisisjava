package ch06.sec08.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		Computer adder = new Computer();
		int[] values = {1, 2, 3, 4, 5, 6};
		
		//... 으로 선언한 메소드는 둘 다 실행가능
		System.out.println(adder.Adder(1,2,3,4,5));
//		System.out.println(adder.Adder(values));
		System.out.println();
		System.out.println(adder.Adder2(values));
		//매개변수를 []로 선언한 경우 new int[] 처럼 생성해서 넣어줘야함.
		System.out.println(adder.Adder2(new int[] {1,2,3,4,5}));
		//이건 안됨
//		System.out.println(adder.Adder2(1,2,3,4,5));
	}
}
