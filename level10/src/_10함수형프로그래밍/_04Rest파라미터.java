package _10함수형프로그래밍;

import java.util.Arrays;
import java.util.List;

public class _04Rest파라미터 {
	
	// 매개 변수 개수를 모를 때 사용한다.
	public static int getSum(int ...nums) { // int[] nums
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.println(getSum());
		System.out.println(getSum(10));
		System.out.println(getSum(10,20));
		System.out.println(getSum(10,20,30));
		System.out.println(getSum(10,20,30,40));
		System.out.println(getSum(10,20,30,40,50));
		System.out.println("------");
		
		List<String> list = Arrays.asList("강아지", "고양이", "사자", "토끼");
		
		// [1. 향상된 for 문] 리스트의 요소 전체를 꺼내온다.
		for(String element : list) {
			System.out.print(element + " ");
		}
		System.out.println("\n------");
		
		// [2. for each 문] 리스트의 요소 전체를 꺼내온다. (함수형 인터페이스)
		list.forEach(element -> System.out.print(element + " "));
		System.out.println("\n------");
		
		// [3. for each 문] 리스트의 요소 전체를 꺼내온다.
//			- 클래스 객체 :: 매서드 이름 (매개변수 값 생략)
		list.forEach(System.out::print);
	}

}
