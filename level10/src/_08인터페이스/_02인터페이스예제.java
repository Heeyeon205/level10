package _08인터페이스;

interface Dragable {
	void move(int x, int y);
}

interface Clikable {
	void click();
	void doubleClick();
}

abstract class Button implements Dragable, Clikable{
	String name;
	int size;
	
	abstract void actionButton();
}

class Title implements Clikable{

	@Override
	public void click() {
		System.out.println("타이틀을 클릭했습니다.");
	}

	@Override
	public void doubleClick() {
			System.out.println("타이틀을 더블 클릭했습니다.");
	}
}

class NaverButton extends Button {

	@Override
	void actionButton() {
		System.out.println("네이버로 이동");
	}

	@Override
	public void move(int x, int y) {
		System.out.printf("좌표 %d : %d 이동", x, y);
	}

	@Override
	public void click() {
		System.out.println("같은 창에서 네이버 홈으로 이동");
	}

	@Override
	public void doubleClick() {
		System.out.println("새 창에서 네이버 홈으로 이동");
	}
}

class GoogleButton extends Button {

	@Override
	void actionButton() {
		System.out.println("구글로 이동");
	}

	@Override
	public void move(int x, int y) {
		System.out.printf("좌표 %d : %d 이동", x, y);
	}

	@Override
	public void click() {
		System.out.println("같은 창에서 구글 홈으로 이동");
	}

	@Override
	public void doubleClick() {
		System.out.println("새 창에서 구글 홈으로 이동");
	}
}

public class _02인터페이스예제 {

	public static void main(String[] args) {
		
		Button btn1 = new NaverButton();
		Button btn2 = new GoogleButton();
		Title title = new Title();
		
		btn1.click();
		btn1.actionButton();
		
		title.doubleClick();
		
		btn2.doubleClick();
		btn2.move(10, 20);
	}

}
