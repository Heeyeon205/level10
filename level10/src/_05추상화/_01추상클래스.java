package _05추상화;

// 클래스 설계: 상태(state -> data), 행동(기능 == method)

// 추상 클래스: 단 하나라도 미 완성된 매소드가 있다면 추상클래스로 만들어야 한다.
abstract class A {
	// 완성된 메소드
	void printSomething() {
		System.out.println("something");
	}
	
	// 미완성 매소드: body{} 가 존재하지 않는다.
	abstract void printAnything();
}

// 추상 클래스를 상속받은 클래스는 반드시 미 완성된 클래스를 완성시켜야 한다.
class B extends A {

	@Override
	void printAnything() {
		System.out.println("나는 B class");
	}
	
}

public class _01추상클래스 {

	public static void main(String[] args) {
		
//		추상클래스는 미완성 클래스로 객체 생성이 불가능하다.
//		A a = new A();
		
		B b = new B();
		b.printAnything();
		b.printSomething();
	}

}
