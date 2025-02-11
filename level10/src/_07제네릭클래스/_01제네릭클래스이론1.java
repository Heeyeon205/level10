package _07제네릭클래스;

class Box<T> {
	private T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
}

class Tv {
	String brand;
	int serialNo;
	
	
	public Tv(String brand, int serialNo) {
		super();
		this.brand = brand;
		this.serialNo = serialNo;
	}

	@Override
	public String toString() {
		return "Tv [brand: " + brand + ", serialNo: " + serialNo + "]";
	}
}

class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
	public M getModel() {
		return model;
	}
	
	@Override
	public String toString() {
		return "Product [kind=" + kind + ", midel=" + model + "]";
	}
	
}

public class _01제네릭클래스이론1 {

	public static void main(String[] args) {
		
		Box<Integer> test = new Box();
		test.setT(10);
		System.out.println(test.getT());
		
		Box<String> test2 = new Box();
		test2.setT("홍길동");
		System.out.println(test2.getT());
		
		Box<Tv> test3 = new Box();
		test3.setT(new Tv("LG", 1234));
		System.out.println(test3.getT());
		
		Product<Integer, String> test4 = new Product();
		test4.setKind(1000);
		test4.setModel("모델명");
		System.out.println(test4);
		
		Product<Tv, String> test5 = new Product();
		test5.setKind(new Tv("삼성", 2222));
		test5.setModel("스탠바이미");
		System.out.println(test5);
	}

}
