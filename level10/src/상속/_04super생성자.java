package 상속;

class Product {
	String name;
	int price;
	
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}

// this() => 자기 자신의 기본 생성자
// super(); => 부모의 생성자 호출

// this => 자기 자신의 객체 주소값
// super => 부모 객체의 주소값

class Fruit extends Product {
	String origin;
	public Fruit(String name, int price, String origin) {
		super(name, price);
		this.origin = origin;
	}
	
	@Override
	public String toString() {
		return "Fruit [ " + super.toString() +  origin + "]";
	}
	
}
public class _04super생성자 {

	public static void main(String[] args) {
		
		Product p = new Product("고기", 10000);
		Fruit f = new Fruit("바나나", 2000, "필리핀");
		
		System.out.println(p);
		System.out.println(f);
		
	}

}
