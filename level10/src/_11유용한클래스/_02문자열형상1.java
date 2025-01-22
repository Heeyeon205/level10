package _11유용한클래스;

public class _02문자열형상1 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		str1 += "def";	// new String("abcdef");
		System.out.println(System.identityHashCode(str1));
		
//		String 읽기 전용 배열이다. (수정이 불가능 하다 / 수정하면 새로운 값으로 재 할당)
		
//		[String 수정 하는 방법]
//		1. String Builder(싱글 스레드)
//		2. String Buffer(멀티 스레드)
//			- 둘 다 내부적으로 Char[] 타입의 가변 문자 배열이 들어있다.
//			- 문자열 자체의 여러 변경값이 있을 때 유용하다.
		
		StringBuilder builder = new StringBuilder();
		System.out.println(System.identityHashCode(builder));
		builder.append("abc");
		System.out.println(System.identityHashCode(builder));
		builder.append("def");
		System.out.println(System.identityHashCode(builder));
		System.out.println(builder);
		
//		builder 초기화
		builder.setLength(0);
		System.out.println(builder);
	}

}
