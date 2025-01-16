package 상속_개념;

// 객체지향프로그래밍 OOP : Object Oriented Programming
// ex) 영화를 예매한다 -> 영화, 영화관, 유저, 좌석, 스크린

// 객체가 유기적으로 존재해서 상호작용(매서드 호출, 리턴값 받아오기) => 시스템 구현

// 1. 캡슐화 encapsulation : 객체를 독립적으로 만든다. private 필드, getter, setter
// 2. 상속 inheritance : 자식 클래스가 부모 클래스의 속성(필드 + 매서드)을 상속 받는다.
// 3. 추상화 abstract : 
// 4. 다형성 polymorphism : 

class A {
	int a = 10;
	int b = 20;
	A() {
		System.out.println("A 생성!");
	}
}

class B {
	A a;
	int c = 30;
	int d = 40;
	B(){
		a = new A();
		System.out.println("B 생성!");
	}
}

// 상속 : extends 부모클래스
// 자식 객체는 부모 객체가 만들어진 다음에 만들어진다.
class C extends A{
	int e;
	int f;
	C(){
		// super(); 자동으로 부모 클래스 생성 (부모 클래스 생성자 호출) 
		System.out.println("C 생성!");
	}
	public C(int e, int f) {
		this(); // 자기 자신의 기본 생성자
		this.e = e;
		this.f = f;
	}
	
}
public class _01상속 {
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.c);
		System.out.println(b.d);
		System.out.println(b.a.a);
		System.out.println(b.a.b);
		System.out.println("--------------");
		C c = new C(100, 200);
		System.out.println(c.a);
		System.out.println(c.b);
	}
	
}
