package _03접근제어자_실습;

import _02상속_개념.AccessTest;

class Child extends AccessTest {
	int f = 50;
	Child(){
		// super();
		super.a = 100; // default
		super.c = 300; // protected
	}
}
public class _01접근제어자테스트 {

	public static void main(String[] args) {
		Child c = new Child();
		c.a = 100;
		c.f = 200;	
		
		AccessTest acc = new AccessTest();
	}
	
}
