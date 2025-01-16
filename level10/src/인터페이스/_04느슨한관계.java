package 인터페이스;

interface I {
	void methidI();
}
class AAA {
	// 인터페이스로 타입을 맞췄기 때문에 구현 클래스가 무엇이든 상관 없다.
	void methodA(I i) {
		System.out.println("매소드 A 호출");
		i.methidI();
	}
}

class BBB implements I{
	

	@Override
	public void methidI() {
		System.out.println("BBB가 매소드 i 호출");
	}
}

class CCC implements I{
	

	@Override
	public void methidI() {
		System.out.println("CCC가 매소드 i 호출");
	}
}
public class _04느슨한관계 {

	public static void main(String[] args) {
		
		AAA a = new AAA();
		a.methodA(new BBB());
		a.methodA(new CCC());
	}

}
