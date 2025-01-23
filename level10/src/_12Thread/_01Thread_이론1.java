package _12Thread;

//	동기적: 메모리 호출 순서로 순차적으로 실행. 현재 실행하는 것을 멈추고 실행.
//	비 동기적: 호출될 때, 다른 곳에서 실행. 현재 실행하는 것을 멈추지 않는다.

// Thread 클래스는 Runnable 인터페이스를 상속 받고 있다.
class Thread1 extends Thread {
	@Override
	public void run() {
		for(int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(300); // 0.3초
			}catch(Exception e) {
				
			}
			System.out.print("1");
		}
	}
}


class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(300); // 0.3초
			}catch(Exception e) {
				
			}
			System.out.print("2");
		}
	}
}

public class _01Thread_이론1 {

	public static void main(String[] args) {
		
		System.out.println("메인 쓰레드 영역");
		
//		쓰레드 상속 받은 클래스 생성
		Thread thread1 = new Thread1();
		
//		Runnable 을 구현해서 만든 클래스 생성
		Thread thread2 = new Thread(new MyRunnable());
		
		// 스레드를 생성하고 실행하는 매소드
//		thread1.start();	
//		thread2.start();	
		
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 20; i++) {
					try {
						Thread.sleep(300); // 0.3초
					}catch(Exception e) {
						e.printStackTrace();
					}
					System.out.print("3");
				}
			}
		});
		
		Thread thread4 = new Thread(() -> {
		    for (int i = 1; i <= 20; i++) {
		        try {
		            Thread.sleep(300); // 0.3초
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		        System.out.print("4");
		    }
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		for(int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(300); // 0.3초
			}catch(Exception e) {
				
			}
			System.out.print("M");
		}
		
	}

}
