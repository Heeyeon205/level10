package _01상속;

public class AccessTest {
	public int a; 		// 같은 프로젝트내에 접근 가능
	int b; 				// default 같은 패키지 내에서 접근 가능
	protected int c; 	// 부모 자식 클래스만 접근 가능
	private int d; 		// 같은 클래스만 접근 가능
	
	public final int num = 100;
	
	protected void printAll() {
		System.out.printf(" %d %d %d %d \n", a, b, c, d);
	}


}
