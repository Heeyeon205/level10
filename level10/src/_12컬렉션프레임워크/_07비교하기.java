package _12컬렉션프레임워크;

import java.util.Comparator;
import java.util.TreeSet;

// Comparable: 자신과 다른 객체를 비교한다.
// Comparator: 주어진 두 객체르 비교한다. (TreeSet, TreeMap) 컬렉션 정렬 기준

class Person implements Comparable<Person> {
	private static int lastNo = 0;
	private int no;
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.no = ++lastNo;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [no: " + no + ", name: " + name + ", age: " + age + "] ";
	}

	@Override
	public int compareTo(Person o) {
//		return name.compareTo(o.name);	// 이름순 정렬
		
		if(no > o.no) {	// 번호순 정렬
			return 1;
		}else {
			return -1;
		}
	}
	
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

class PersonComp implements Comparator<Person> {
	enum SortBy {NO, NAME, AGE};
	enum SortDir{ASC, DESC}
	
	private SortBy sortBy;
	private SortDir sortDir;
	
	public PersonComp(SortBy sortBy, SortDir sortDir) {
		super();
		this.sortBy = sortBy;
		this.sortDir = sortDir;
	}

	@Override
	public int compare(Person o1, Person o2) {
		int result = 0;
		switch(sortBy) {
		case NO : result = o1.getNo() > o2.getNo() ? 1 : -1; break;
		case NAME : result = o1.getName().compareTo(o2.getName()); break;
		case AGE : result = o1.getAge() > o2.getAge() ? 1 : -1; break;
		}
		return result * (sortDir == sortDir.ASC ? 1 : -1);
	};
}

public class _07비교하기 {

	public static void main(String[] args) {
		
		Person[] pList = {
				 new Person ("홍길동" , 20),
				 new Person ("전우치" , 10),
				 new Person ("임꺽정" , 28),
				new Person ("스폰지밥" , 32),
				new Person ("뚱이" , 18),
				 new Person ("개똥이" , 23)	
		};
		
		TreeSet[] treeSets =  {
			new TreeSet<>(),
			new TreeSet<>( new PersonComp(PersonComp.SortBy.NO, PersonComp.SortDir.DESC)),
			new TreeSet<>( new PersonComp(PersonComp.SortBy.AGE, PersonComp.SortDir.ASC)),
			new TreeSet<>( new PersonComp(PersonComp.SortBy.NAME, PersonComp.SortDir.DESC)),
		};
		
		for(Person p : pList) {
			for(TreeSet ts : treeSets) {
				ts.add(p);
			}
		}
		System.out.println("=============");
		
		for(TreeSet ts : treeSets) {
			for(Object p : ts) {
				System.out.println(p);
			}
			System.out.println("------------------");
		}
		
	}

}
