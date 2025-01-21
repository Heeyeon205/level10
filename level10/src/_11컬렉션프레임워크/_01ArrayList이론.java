package _11컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 컬렉션 프레임워크 : 데이터 저장 알고리즘을 이미 만든 클래스 모음집

class User implements Comparable<User> {
	String name;
	int age;
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age + " ";
	}

	@Override
	public int compareTo(User o) {
//		return name.compareTo(o.name);
		if(age > o.age) {
			return 1;
		}else {
			return -1;
		}
	}
}
public class _01ArrayList이론 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(list2);
		
		ArrayList<Integer> list3 = (ArrayList<Integer>) list2.clone();
		System.out.println(list3);
		System.out.println(list2 == list3); // false
		
		ArrayList<User> list4 = new ArrayList<User>();
		list4.add(new User("홍길동", 30));
		list4.add(new User("둘리", 5));
		list4.add(new User("스폰지밥", 15));
		list4.add(new User("뚱이", 24));
		list4.add(new User("또치", 32));
		list4.add(new User("김길순", 23));
		System.out.println(list4);
		Collections.sort(list4); // 정렬하기 위해 implements Comparable<User> 필수!
		System.out.println(list4);
	}

}
