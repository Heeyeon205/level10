package _03접근제어자_실습;

//final 클래스는 상속 받을 수 없다.
final class Test {
	int num1;
	int num2;
	
	Test(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
}

class Parent {
	final int num1= 10; // 원시타입은 값 변경이 불가능하다.
	int num2 = 20;
	
	// 메소드에 final 키워드를 붙이면 오버라이딩이 불가능하다.
	final void printNum() {
		System.out.println(num1);
	}
}

class Childs extends Parent {
	
}

public class _02final테스트 {

	public static void main(String[] args) {
		
		final Parent p = new Parent(); // 참조 타입은 새로운 객체로 변경 불가능 (주소값)
		
//		p.num1 = 100;
		p.num2 = 10;
		
	}
}
