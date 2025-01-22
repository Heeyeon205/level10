package _04추상화_실습1;

public class SweetPotatoPizza extends Pizza{

	int test = 10000;
	public SweetPotatoPizza(int price, String brand) {
		super(price, brand, "고구마 피자");
	}

	@Override
	void putTopping() {
		System.out.println("고구마 토핑");
	}

}
