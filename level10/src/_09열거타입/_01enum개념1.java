package _09열거타입;

// [열거타입 enumeration type] : 상수 모음집
// 	- 열거 값은 자동으로 static final 상수로 취급된다.

enum ButtonMode {
	LIGHT, DARK
}

enum ButtonSpace {
	SINGLE, DOUBLE
}

class Button {
	private ButtonMode buttonMode = ButtonMode.LIGHT;
	private ButtonSpace buttonSpace = ButtonSpace.SINGLE;
	
	public void changeButtonMode() {
		buttonMode = buttonMode == ButtonMode.LIGHT ? ButtonMode.DARK : ButtonMode.LIGHT;
	}

	public ButtonMode getButtonMode() {
		return buttonMode;
	}
	public void setButtonMode(ButtonMode buttonMode) {
		this.buttonMode = buttonMode;
	}
	public ButtonSpace getButtonSpace() {
		return buttonSpace;
	}
	public void setButtonSpace(ButtonSpace buttonSpace) {
		this.buttonSpace = buttonSpace;
	}
	
}

public class _01enum개념1 {

		static final int num = 5;
		
		public static void main(String[] args) {
			
			String day = "MON";
			if(day == "MON") {
				System.out.println("오늘은 월요일입니다.");
			}
			System.out.println(Week.MON);
			
			Week day2 = Week.MON;
			if(day2 == Week.MON) {
				System.out.println("오늘은 월요일입니다.");
			}
			
			 Button btn = new Button();
			 System.out.println(btn.getButtonMode());
			 System.out.println(btn.getButtonSpace());
			 
			 btn.changeButtonMode();
			 
			 Week today = Week.FRI;
			 
			 switch(today) {
			 case MON : System.out.println("월요일입니다."); break;
			 case TUE : System.out.println("화요일입니다."); break;
			 case WED : System.out.println("수요일입니다."); break;
			 case THR : System.out.println("목요일입니다."); break;
			 case FRI : System.out.println("금요일입니다."); break;
			 case SAT : System.out.println("토요일입니다."); break;
			 case SUN : System.out.println("일요일입니다."); break;
			 } 
		}

}
