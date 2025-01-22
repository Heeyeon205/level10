package _10함수형프로그래밍;

// 함수형 프로그래밍: 함수를 값으로 사용 가능(변수 값, 매개변수 값, 리턴 값)
//	- 단 하나의 추상 메소드만 존재해야한다.
// 함수: 어떤 클래스에 소속되어 있지 않는 매소드
// 메소드: 어떤 클래스 내부에 있는 메소드

@FunctionalInterface
interface Test {
	int getSum(int[] arr); // public abstract 생략
//	void printsum();
}

public class _01함수형프로그래밍_개념 {

	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {

//		[명령형 프로그래밍] how(과정)
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

//		[선언형 프로그래밍] 함수형 => 결과 집중적
		System.out.println(getSum(arr));

//		[내부클래스 or 이너클래스] 익명클래스: 이름이 없는 클래스(일회성 클래스)
		Test result = new Test() {
			@Override
			public int getSum(int[] arr) {
				int sum = 0;
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i];
				}
				return sum;
			}
		};
		System.out.println(result.getSum(arr));

//		[람다식] 자바스크립트의 화살표 함수
//		함수형 프로그래밍을 편하게 사용하는 방식
		Test result2 = (int[] array) -> {
			int hap = 0;
			for (int i = 0; i < arr.length; i++) {
				hap += array[i];
			}
			return hap;
		};
		System.out.println(result2.getSum(arr));
		
//		 이미 만들어진 익명클래스 접근 할 때 (매개변수) -> 안에 불러올 함수
		Test result3 = array -> result2.getSum(arr);
		System.out.println(result3.getSum(arr));
//        
	}
}
