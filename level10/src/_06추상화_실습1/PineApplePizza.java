package _06추상화_실습1;

public class PineApplePizza extends Pizza{


	public PineApplePizza(int price, String brand) {
		super(price, brand, "파인애플 피자");
	}

	@Override
	void putTopping() {
		System.out.println("파인애플 토핑");
	}
	
	

}
