package ch12.sec04;

public class InExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int speed = 0;
		int keyCode = 0;
		
		while(true) {
			System.out.println("\033[H\033[2J");
			System.out.flush();
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {
					speed++;
				} else if(keyCode == 50) {
					speed--;
				} else if(keyCode == 51) {
					break;
				}
				System.out.println("-----");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-----");
				System.out.println("현재 속도 = " + speed);
				System.out.print("선택: ");
			}
			keyCode = System.in.read();
		}
	}

}
