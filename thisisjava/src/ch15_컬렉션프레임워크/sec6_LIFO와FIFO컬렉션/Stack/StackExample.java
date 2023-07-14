package ch15_컬렉션프레임워크.sec6_LIFO와FIFO컬렉션.Stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		//100원부터 넣었지만 제일 나중에 넣은 10원부터 나올 것이다.
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼낸 동전 : " + coin.getValue()+"원");
		}
	}

}
