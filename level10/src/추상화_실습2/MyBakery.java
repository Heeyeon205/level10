package 추상화_실습2;

public class MyBakery extends MyBrand{
	private static int myNum = 0;
	private boolean isHandmade;
	
	public static String getSlogan() {
		return String.format(SLOGAN, "Lyle Bakery");
	}
	
	public MyBakery(String name, boolean isHandmade) {
		super(++myNum, name);
		this.isHandmade = isHandmade;
	}

	@Override
	public void takeOrder() {
		System.out.printf(" Lyle Bakery %s 빵을 주문했습니다. \n", super.info() + (isHandmade ? " 수제" : ""));
	}
}
