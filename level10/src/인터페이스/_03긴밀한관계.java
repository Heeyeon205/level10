package 인터페이스;


// 클래스랑 클래스 간의 결속이 높으면 가독성은 좋지만 유지보수가 어렵다.
class AA {
//	 클래스 A랑 클래스 B는 긴밀한 관계를 가지고 있다.
//	 매소드 A를 호출하려면 반드시 BB 객체가 있어여 한다.
	void methodA(BB b) {
		System.out.println("매소드 A 호출");
		b.methodB();
	}
}

class BB {
	
	void methodB() {
		System.out.println("매소드 B 호출");
	}
}

class CC {
	
	void methodC() {
		System.out.println("매소드 C 호출");
	}
}

public class _03긴밀한관계 {

	public static void main(String[] args) {
		
		AA a = new AA();
		a.methodA(new BB());
//		a.methodA(new CC());
	}

}
