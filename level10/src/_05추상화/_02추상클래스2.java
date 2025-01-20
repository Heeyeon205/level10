package _05추상화;

// 부모 클래스, 상위 클래스, super
class Parent {
	int a = 10;
	int b = 20;
}

class Child extends Parent {
	int c = 30;
	int d = 40;
}

// 자식클래스, 하위 클래스, 서브클래스
public class _02추상클래스2 {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		
//		[casting] 형 변환
		
		// 강제 형 변환
		System.out.println( (int)3.14 );
		
		// upcasting: 하위 클래스가 상위 타입으로 전환 (자식 클래스 -> 부모 클래스로 객체 전환)
		
		// upcasting
		Parent parent = new Child();
		
		// downcasting: 
		Child child = (Child)parent;
		
	}

}
