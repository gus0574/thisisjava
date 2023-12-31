package ch09.sec06.exam03;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener {
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Ok 클릭");
			}
		}
		
		btnOk.setClickListener(new OkListener());
		
		btnOk.click();
		
		//----
		
		Button btnCancel = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("Cancel 클릭");
			}
		}
		
		btnCancel.setClickListener(new CancelListener());
		
		btnCancel.click();
	}

}
