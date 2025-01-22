package _10함수형프로그래밍;

import java.util.function.BinaryOperator;

class Calculate {
	int add(int a, int b) {return a+b;}
	int subtract(int a, int b) {return a-b;}
	int multiply(int a, int b) {return a*b;}
}

@FunctionalInterface
interface CalFuntion {
	void calculate(int a, int b);
}

public class _03함수형프로그래밍_실습 {

	public static void main(String[] args) {
		
		Calculate cal = new Calculate();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.subtract(10, 20));
		System.out.println(cal.multiply(10, 20));
		System.out.println("==========");
		
//		각각 함수형 인터페이스 구현
		CalFuntion add = (a, b) -> System.out.println((a + b));
		CalFuntion substract = (a, b) -> System.out.println((a - b));
		CalFuntion multply = (a, b) -> System.out.println((a * b));
        add.calculate(10, 20);
        substract.calculate(10, 20);
        multply.calculate(10, 20);
        System.out.println("==========");
        
//     	이미 구현된 람다식
        BinaryOperator<Integer> add2 = (a, b) -> a+ b;
        System.out.println(add2.apply(10, 20));
//		
	}
}
