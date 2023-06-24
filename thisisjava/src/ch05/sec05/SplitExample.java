package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String board = "번호,제목,내용,글쓴이";
		String[] arr = board.split(",");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
