package _11유용한클래스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _04문자열향상3 {

	public static void main(String[] args) {
		
//		입출력 성능 향상: BufferedReader & BufferedWrite 사용
//		주의 1: IOException 처리해주기
//		주의 2: 모든 데이터를 String 으로 처리를 하기 때문에 char[] 의 후 가공 필요 
		
		
		StringBuilder builder = new StringBuilder();
		
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));){
			
			// 입력
			System.out.println("input: ");
			builder.append(br.readLine());
			bw.write(builder.toString());
			
			// 빌더 값 초기화
			builder.setLength(0);
			
			// 버퍼 남은 데이터를 비운다.
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
