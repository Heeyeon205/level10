package 추상화_실습2;

public abstract class MyBrand {
	protected static final String SLOGAN = "우리 %s 매장은 가성비가 좋다.";
	protected final int NO;
	protected final String NAME;

	public MyBrand(int no, String name) {
		this.NO = no;
		this.NAME = name;
	}
	
	public String info() {
		return String.format("%d호 %s점", NO, NAME);
	}
	
	public abstract void takeOrder();
}
