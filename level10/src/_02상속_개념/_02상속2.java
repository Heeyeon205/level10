package _02상속_개념;

class D {
	int d;
	D(){
		System.out.println("D 생성!");
	}
}
class E extends D{
	int e;
	E(){
		// super();
		System.out.println("E 생성!");
	}
}
class F extends E{
	int f;
	F(){
		// super();
		System.out.println("F 생성!");
	}
}
public class _02상속2 {

	public static void main(String[] args) {
		
		// 가장 상위의 부모 클래스부터 만들어진다.
		F f = new F();
		
	}

}
