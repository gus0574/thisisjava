package ch16_람다식.sec2_매개변수가없는람다식.Button;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OK 버튼 객체 생성
		Button btnOk = new Button();
		
		//OK 버튼 객체에 람다식(clickListener 익명 구현 객체) 주입
		btnOk.setClickListener(() -> {
			System.out.println("OK 버튼을 클릭했습니다.");
		});
		
		//OK 버튼 클릭
		btnOk.click();
		
		//취소 버튼 객체 생성
		Button btnCancel = new Button();
		
		//취소 람다식 주입
		btnCancel.setClickListener(() -> {
			System.out.println("취소 버튼을 클릭했습니다.");
		});
		
		btnCancel.click();
	}

}
