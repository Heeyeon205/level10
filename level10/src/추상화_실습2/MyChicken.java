package 추상화_실습2;

public class MyChicken extends MyBrand{
	private static int myNum = 0;
	
	public static String getSlogan() {
		return String.format(SLOGAN, "Lyle Chicken");
	}
	
	public MyChicken(String name) {
		super(++myNum, name);
	}

	@Override
	public void takeOrder() {
		System.out.printf(" Lyle Chiken %s 치킨을 주문했습니다.\n", super.info());
	}

}
