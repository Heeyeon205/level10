package _14콜렉션멤버;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
	private static Utils instance;
	private Scanner sc = new Scanner(System.in);
	private final String CUR_PATH = System.getProperty("user.dir") + "/src/" + Utils.class.getPackageName() + "/";
	private final String FILE_PATH = CUR_PATH + "member.txt";
	
	private Utils() {}
	
	public static Utils getInstance() {
		if(instance == null) {
			instance = new Utils();
		}
		return instance;
	}
	
	public int getValue(String msg, int min, int max) {
		while(true) {
			try {
			System.out.println(msg);
			int sel = sc.nextInt();
			sc.nextLine();
			if(sel < min || sel >= max) {
				System.out.println("입력 범위 오류입니다.");
				continue;
			}
			return sel;
			}catch(InputMismatchException e){
				System.out.println("숫자만 입력 가능합니다.");
				continue;
			}
		}
	}

	public String getString(String msg) {
		System.out.println(msg);
		String str = sc.nextLine();
		return str;
	}

	public void saveFile(ArrayList<Member> mList) {
		try (FileWriter fw = new FileWriter(FILE_PATH);){
			mList.sort(Member.ID_COMPARATOR);
			for(Member m : mList) {
				fw.write(m.getId()+"/"+m.getPw()+"/"+m.getName()+"\n");
			}
			System.out.println("파일 저장 성공!\n파일 경로: " + FILE_PATH);
		}catch(FileNotFoundException e) {
			System.out.println("파일 경로를 찾을 수 없습니다!");
		}catch (IOException e) {
			System.out.println("오류 발생");
		}
	}
	
	public void loadFile(ArrayList<Member> mList) {
		try (FileReader fr = new FileReader(FILE_PATH);
				BufferedReader br = new BufferedReader(fr);){
			mList.clear();
			String line;
			String[] temp;
			while((line = br.readLine()) != null) {
				temp = line.split("\n");
				for(int i = 0; i < temp.length; i++) {
					String[] info = temp[i].split("/");
					mList.add(new Member(info[0], info[1], info[2]));
				}
			}
			System.out.println("파일 불러오기 성공!\n파일 경로: " + FILE_PATH);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.\n경로: " +  FILE_PATH);
		} catch (IOException e) {
			System.out.println("오류 발생");
		}
		
	}
}
