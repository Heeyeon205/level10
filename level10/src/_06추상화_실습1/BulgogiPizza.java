package _06추상화_실습1;

public class BulgogiPizza extends Pizza{


	public BulgogiPizza(int price, String brand) {
		super(price, brand, "불고기 피자");
	}

	@Override
	void putTopping() {
		System.out.println("불고기 토핑");
	}
}
