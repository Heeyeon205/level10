package _12컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class _02LinkedList이론 {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		System.out.println(list1);
		
//		LinkedList<Integer> list2 = new LinkedList<Integer>(LinkedList.asList(1,2,3,4,5));
//		System.out.println(list2);
		
//		ArrayList<Integer> list3 = (LinkedList<Integer>) list2.clone();
//		System.out.println(list3);
//		System.out.println(list2 == list3); // false
		
		LinkedList<User> list4 = new LinkedList<User>();
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
