package p413;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	// initial value of a field?
	// inner? nested? interface
	Button.OnClickListener listener = new Button.OnClickListener() {
		// 이야.. 친절하다. 자동완성
		@Override
		public void onClick() {
			System.out.println("call?");
		}
	};
	
	
	// constructor of Window class?
	Window(){
		button1.setOnClickListener(listener);
		
		button2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("send the message");
			}
		  }
		);
	}
}
