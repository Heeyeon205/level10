package _11유용한클래스;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class _01날짜와_시간 {

	public static void main(String[] args) {
		
//		1970년 1월 1일 0시 기준으로 현재까지 경과한 시간을
//		1000분의 1(밀리세컨드)로 반환한다.
		System.out.println(System.currentTimeMillis());
		
//		오늘 날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
//		현재 시간
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
//		현재 받아오는 위치
		System.out.println(Clock.systemDefaultZone());
		
//		다음 날짜
		LocalDate tomrrow = today.plusDays(1);
		System.out.println(tomrrow);
		
//		이전 날짜
		LocalDate yesterday = today.minusDays(1);
		System.out.println(yesterday);
		
//		날짜 간격 계산
		LocalDate test = LocalDate.of(2030, 5, 5);
		Period test2 = Period.between(today, test);
		System.out.printf("%d년 %d월 %d일\n", test2.getYears(), test2.getMonths(), test2.getDays());
		
//		날짜 간격 시간 계산
		Duration test3 = Duration.between(LocalDateTime.of(2025, 01, 22, 13, 12), LocalDateTime.of(2025,01,23,13,05));
		System.out.println(test3);
		System.out.println(test3.toDays());
		System.out.println(test3.toHours());
		System.out.println(test3.toMinutes());
		
//		날짜 원하는 스트링 값으로 반환
		DateTimeFormatter sdf1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		LocalDateTime today2 = LocalDateTime.now();
		System.out.println(today2);
		System.out.println(today2.format(sdf1));
		
		DateTimeFormatter sdf2 = DateTimeFormatter.ofPattern("yy년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println(today2.format(sdf2));
		
		
//		String -> 날짜 객체로 변환
		String nowDate = "2025-01-22";
		DateTimeFormatter sdf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate time = LocalDate.parse(nowDate, sdf3);
		System.out.println(time);
	}

}
