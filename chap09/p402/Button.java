package p402;

public class Button {
	// interface type field
	OnClickListener listener;
	
	
	// for polymorphism ? 사전에서 찾아봄. 다형성.
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// nested interface
	interface OnClickListener{
		void onClick(); // abstract method
	}
}
