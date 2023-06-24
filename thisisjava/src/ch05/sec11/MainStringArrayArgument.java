package ch05.sec11;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("입력값 부족");
			System.exit(0);
		}
		
		String[] arg = {args[0], args[1]};
		
		int[] argsNum = {Integer.parseInt(arg[0]), Integer.parseInt(arg[1])};
		int result = argsNum[0] + argsNum[1];
		
		System.out.println(argsNum[0] + "+" + argsNum[1] + " = " + result);
	}

}
