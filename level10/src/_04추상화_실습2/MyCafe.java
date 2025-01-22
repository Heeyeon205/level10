package _04추상화_실습2;

public class MyCafe extends MyBrand{
	private static int myNum = 0;
	private boolean isToGo;
	
	public static String getSlogan() {
		return String.format(SLOGAN, "Lyle Cafe");
	}
	
	public MyCafe(String name, boolean isToGo) {
		super(++myNum, name);
		this.isToGo = isToGo;
	}

	@Override
	public void takeOrder() {
		System.out.printf(" Lyle Cafe %s \n", super.info() + (isToGo ? " 커피를 주문했습니다." : " 매장에서 드시겠습니까?"));
	}
}
