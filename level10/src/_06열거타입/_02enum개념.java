package _06열거타입;

class Button2 {
	
	enum Mode {
		LIGHT, DARK
	}

	enum Space {
		SINGLE, DOUBLE
	}
	
	private Mode mode = Mode.LIGHT;
	private Space space = Space.SINGLE;
	
	public Mode getMode() {
		return mode;
	}
	public void setMode(Mode mode) {
		this.mode = mode;
	}
	public Space getSpace() {
		return space;
	}
	public void setSpace(Space space) {
		this.space = space;
	}
	
	public void changeButtonMode() {
		mode = mode == Mode.LIGHT ? Mode.DARK : Mode.LIGHT;
	}
}

public class _02enum개념 {

	public static void main(String[] args) {
		Button2 btn2 = new Button2();
		
		System.out.println(btn2.getMode());
		System.out.println(btn2.getSpace());
		btn2.setSpace(btn2.getSpace().DOUBLE);
		btn2.changeButtonMode();
		System.out.println(btn2.getMode());
		System.out.println(btn2.getSpace());
	}

}
