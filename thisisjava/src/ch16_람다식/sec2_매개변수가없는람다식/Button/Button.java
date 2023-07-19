package ch16_람다식.sec2_매개변수가없는람다식.Button;

public class Button {
	//정적 멤버 인터페이스
	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	
	//필드
	private ClickListener clickListener;
	
	//메소드
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		this.clickListener.onClick();
	}
}
