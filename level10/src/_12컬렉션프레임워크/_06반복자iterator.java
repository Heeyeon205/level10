package _12컬렉션프레임워크;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _06반복자iterator {

	public static void main(String[] args) {
		
		int[] list1 = {1,2,3,4,5,6};
		int[] list2 = list1.clone();	// clone()은 깊은 복사다.
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		
		list2[2] = 100;
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		
		System.out.println("=========");
		Set<Integer> list3 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
//		System.out.println(list3);
//		list3.remove(3);
//		System.out.println(list3);
		
		
//		이 방법으론 값을 삭제할 수 없다.
		for(Integer num : list3) {
//			if(num == 3) {
//				list3.remove(num);
//			}
			System.out.println(list3);
		}
		
		
		Iterator<Integer> itor = list3.iterator();
//		itor.next();
//		System.out.println(itor.next());
//		System.out.println(itor.next());
		
		
		// Set에서 특정 값을 삭제하는 방법 (인덱스가 없기 때문에)
		while(itor.hasNext()) {
			if(itor.next() == 3) {
				itor.remove();
			}
		}
		System.out.println(list3);
		
		
		Map<Integer, String> list4 = new HashMap<>();
		list4.put(1, "1");
		list4.put(2, "2");
		list4.put(3, "3");
		list4.put(4, "4");
		list4.put(5, "5");
		list4.put(6, "6");
		System.out.println(list4);
		
		Iterator<Integer> keyList = list4.keySet().iterator();
		Iterator<String> valueList = list4.values().iterator();
		
		// Map 에서는 키 값으로만 값을 삭제할 수 있다.
		while(keyList.hasNext()) {
			if(keyList.next() == 2) {
				keyList.remove();
			}
		}
		System.out.println(list4);
	}

}
