package 다형성실습;

import java.util.Random;

abstract class Shape {
	String name;
	String color;
	double size;

	Shape(String name, String color, int size) {
		super();
		this.name = name;
		this.color = color;
		this.size = size;
	}

	abstract void draw();
	
	@Override
	public String toString() {
		return String.format("%s %s (%.2f)", color, name, size) ;
	}
}

class Line extends Shape {
	Line(String name, String color, int size) {
		super(name, color, size);
	}

	@Override
	void draw() {
		System.out.println("선을 긋는다 ");
	}
}

class Point extends Shape {
	Point(String name, String color, int size) {
		super(name, color, size);
	}

	@Override
	void draw() {
		System.out.println("점을 찍는다");
	}
}

class Circle extends Shape {
	int radius;
	
	Circle(String name, String color, int radius) {
		super(name, color, 0);
		this.radius = radius;
		size = Math.PI * radius * radius;
	}

	@Override
	void draw() {
		System.out.println("원을 그린다");
	}
}

class Rect extends Shape {
	int height;
	int width;

	Rect(String name, String color, int height, int width) {
		super(name, color, 0);
		this.height = height;
		this.width = width;
		size = height * width;
	}

	@Override
	void draw() {
		System.out.println("사각형을 그린다.");
	}
}

class Triangle extends Shape {
	int height;
	int width;

	Triangle(String name, String color, int height, int width) {
		super(name, color, 0);
		this.height = height;
		this.width = width;
		size = height * width * 0.5;
	}

	@Override
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

public class _01도형 {

	public static void main(String[] args) {

//		 [문제1] 10 랜덤하게 생성해서 출력하기 (사이즈 랜덤 1~10 범위)
//		 [문제2] 원만 출력하기
		
//		 [조건]
//		 모양 랜덤, 색상 랜덤, 사이즈 랜덤으로 도형 10개를 출력하시오.
//		 점, 선 기존 size 출력
//		 원, 네모, 세모 => size 넓이를 계산해서 출력

		String[] colors = { "파란", "빨간색", "보라", "분홍", "노랜색" };
		Shape[] list = new Shape[10];

		Random rd = new Random();
		
		System.out.println("========[문제1]========");
		for (int i = 0; i < list.length; i++) {
			int shape = rd.nextInt(5);
			String color = colors[rd.nextInt(colors.length)];
			int size = rd.nextInt(10) + 1;

			switch (shape) {
			case 0 : list[i] = new Line("선", color, size); break;
			case 1 : list[i] = new Point("점", color, size); break;
			case 2 : list[i] = new Circle("원", color, size); break;
			case 3 : list[i] = new Rect("사각형", color, size, size); break;
			case 4 : list[i] = new Triangle("삼각형", color, size, size); break;
			}
		}
		for(Shape s : list) {
			s.draw();
			System.out.println(s.toString());
			System.out.println("--------------");
		}
		
		System.out.println("\n========[문제2]========");
		for(Shape s : list) {
			if(s instanceof Circle) {
			s.draw();
			System.out.println(s);
			System.out.println("--------------");
			}
		}
//		
	}

}

