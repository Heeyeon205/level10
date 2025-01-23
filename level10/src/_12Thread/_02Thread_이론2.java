package _12Thread;

class BGMPlay extends Thread {
		boolean isPlay = true;
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("배경 음악이 실행 중");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class _02Thread_이론2 {

	public static void main(String[] args) {
		
		BGMPlay bgm = new BGMPlay();
		bgm.start();
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("게임 하는 중");
			if(i == 8) {
				System.out.println("엄크");
				System.out.println("엄크로 게임 종료");
				bgm.isPlay = false;
				break;
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
