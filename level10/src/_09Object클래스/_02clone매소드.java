package _09Object클래스;

class Bag { 
	String contains;

	public Bag(String contains) {
		super();
		this.contains = contains;
	}

	@Override
	public String toString() {
		return "[" + contains + "] ";
	}
}

class Person implements Cloneable{
	String name;
	int age;
	Bag bag;
	
	public Person(String name, int age, Bag bag) {
		super();
		this.name = name;
		this.age = age;
		this.bag = bag;
	}

	@Override
	public String toString() {
		return name + " " + age + " " + bag + " ";
	}
	
	public Person clone() {
		try {
			Object obj = super.clone();
			return (Person) obj;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}

public class _02clone매소드 {

	public static void main(String[] args) {
		
		Bag bag1 = new Bag("갤럭시탭");
		Bag bag2 = new Bag("맥북");	
		
		Person p1 = new Person("홍길동", 20, bag1);
		
		// 얕은 복사 (주소값만 복사)
		Person p2 = p1;
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		// 깊은 복사
		Person p3 = p1.clone();
		System.out.println(p1.hashCode());
		System.out.println(p3.hashCode());
		
		
	
	}

}
