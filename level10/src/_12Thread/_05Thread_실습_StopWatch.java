package _12Thread;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

class InputMachine implements Runnable {
	private Scanner sc = new Scanner(System.in);
	public static char input;

	@Override
	public void run() {
		System.out.println("[아무 키를 누르면 스톱워치 시작]");
		input = sc.next().charAt(0);
	}
}

class StopWatch implements Runnable {
	private int time;
	private boolean isPause = false;

	@Override
	public void run() {
		System.out.println("[q] quit [h] hold [x] retunr");
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		LocalTime startTime = LocalTime.now();
		while (true) {
//			System.out.println(InputMachine.input);
			if (InputMachine.input == 'q') {
				LocalTime endTime = LocalTime.now();
				Duration result = Duration.between(startTime, endTime);
				if (result.toMinutes() > 0) {
					System.out.printf("소요시간: %s분 %s초\n", result.toMinutes(), result.toSeconds());
				} else {
					System.out.printf("소요시간: %s초\n", result.toSeconds());
				}
				return;
			}
			if (InputMachine.input == 'x') {
				System.out.println("[스톱워치 종료]");
				return;
			}
			if (InputMachine.input == 'h' || InputMachine.input == 0) {
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				continue;
			}
				long preTime = System.currentTimeMillis();
				System.out.println(sdf.format(preTime) + " (" + ++time + " sec)");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
}

public class _05Thread_실습_StopWatch {

	public static void main(String[] args) {

		Thread inputMachine = new Thread(new InputMachine());
		Thread stopWatch = new Thread(new StopWatch());

		inputMachine.start();
		stopWatch.start();

	}

}
