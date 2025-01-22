package _08컬렉션프레임워크;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _05map이론 {

	public static void main(String[] args) {
		
//		[Map] key, value 두가지가 필요하다.
//			- key 값은 사용자 정의 인덱스다.
//			- key 값은 중복을 허용하지 않는다.
//			- key 값은 배열 타입을 사용할 수 없다.
//			- value 값은 여러가지 타입을 사용할 수 있다.
		
		Map<String, Integer> list = new HashMap<>();
		list.put("apple", 1000);
		list.put("orange", 3000);
		list.put("melon", 5000);
		list.put("banana", 2000);
		System.out.println(list);
		
		list.put("apple", 3000);	// 덮어쓰기
		System.out.println(list);
		
		System.out.println(list.get("orange"));	// 키 값으로 값 찾기
		
		System.out.println(list.keySet());	// 키 값 가져오기
		Set<String> keyList = list.keySet();
		for(String s : keyList) {
			System.out.println(s);
		}
		
		// 해당 키가 있는지?
		System.out.println(list.containsKey("apple"));
		System.out.println(list.containsKey("watermelon"));
		
		// 해당 값이 있는지?
		System.out.println(list.containsValue(3000));
		System.out.println(list.containsValue(9000));
		
		
		Set<Map.Entry<String, Integer>> list2 = list.entrySet();
		System.out.println(list2);
		for(Map.Entry<String, Integer> entry : list2) {
			System.out.println(entry);
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
