package _10함수형프로그래밍;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05스트림_개념 {
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("박연미","유재석","하하","정형돈","노홍철","박연미","하하");
		
		System.out.println("===========1==========");
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("===========2==========");
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println("===========3==========");
		names.forEach(System.out::println);
		
		// List names 스트림 객체 생성
		Stream<String> nameStream = names.stream();
		System.out.println("===========4==========");
		nameStream.forEach(System.out::println);
		
		// Stream 은 최종 연산이 끝나면 바로 닫힌다.
//		nameStream.count();	// 에러 발생
		
		System.out.println("===========5==========");
		// 객체 생성.중복 제거.출력
		names.stream().distinct().forEach(System.out::println);
		
		System.out.println("===========6==========");
		// 객체 생성.중복제거.모은다(리스트로)
		List<String> copyNames = names.stream().distinct().collect(Collectors.toList());
		System.out.println(copyNames);
		
		System.out.println("===========7==========");
		List<Integer> list = new ArrayList<>(Arrays.asList(5,2,0,8,4,1,7,9,3,6));
		System.out.println(list);
		
		System.out.println("===========8==========");
		List<Integer> odds = new ArrayList<>();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 != 0) {
				odds.add(list.get(i));
			}
		}
		System.out.println(odds);
		Collections.sort(odds);
		String data = "";
		for(Integer i : odds) {
			data += i + ", ";
		}
		data = data.substring(0, data.length()-2);
		System.out.println(data);
		
		System.out.println("===========9==========");
		String result = list.stream()
				.filter(i -> i % 2 != 0)
				.sorted(Integer::compare)
				.map(i -> i + "")
				.collect(Collectors.joining(", "));
		System.out.println(result);
				
	}
}
