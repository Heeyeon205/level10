package _12Object클래스;

import java.util.Objects;

class User {
	String name;

	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name);
	}
}
public class _01Equals매소드 {

	public static void main(String[] args) {
		
		String name1 = "test";
		String name2 = "test";
		System.out.println(name1 == name2);	// true
		
		// String 클래스에서 주소값을 가져온다.
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		User u1 = new User("test");
		User u2 = new User("test");
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		
		// equals 를 재정의함으로 true
		System.out.println(u1.equals(u2));
	}

}
