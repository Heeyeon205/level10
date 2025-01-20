package _08인터페이스;

// [interface] movable() flyable(), eatable(), swimable(), aboardable()
//  1. 다중 상속이 목적이다.
//	2. 객체를 만들 수 없다. (추상 클래스 보다 더 추상적이다.)
//	3. 객체를 생성하는 것이 목적이 아니다.

// 추상클래스: 동물, 식물, 기계
// 인터페이스: movable() flyable(), eatable(), swimable(), aboardable()

// 자동차 : 기계 => movable(), aboardable()
// 새: 동물 => movable(), flyable(), eatable(), swimable()
// 사람: 동물 => moveable(), eatable(), swimable(), 
// 오리배: 기계 => moveable(), swimable(), aboardable()
// 연꽃: 식물 : swimable()

//						[추상 클래스]			|		[인터페이스]
// 개념			| 물려 받는 것(혈통, 가문, 계열)	| 장착한다(기능, 행위, 학위, 자격증)
// 다중적용 		| 불가능(부모는 하나)			| 가능
// 생성자			| 가능						| 불가능
// 메소드			| 완성 / 미완성 매소드			| 추상 메소드, default(완성), static(완성)
// 필드(멤버변수)	| 모든 필드					| 상수(public static final 자료형 타입)
// 적용 방식		| extends(확장)				| implements(구현)

class A {
	int num = 10;
	final static int num2 = 10;
}

abstract class B {
	int num = 10;
	abstract void init();
	abstract void test1();
	B() {
		
	}
}

// 인터페이스에서 멤버 변수는 무조건 상수다.
interface C {
	int num = 10; // public static final int num = 10; (생략)
	void test1(); // public abstract void test1(); (생략)
}

interface D {
	void test2();
}

class F extends A implements C,D{

	@Override
	public void test2() {
		
	}

	@Override
	public void test1() {
		
	}
	
}

interface G extends D{
	
}

public class _01인터페이스 {

	public static void main(String[] args) {
		
	}

}
