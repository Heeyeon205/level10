package _12Thread;

class ExThread implements Runnable {
		int no;
		
		public ExThread(int no) {
			this.no = no;
		}
		
		@Override
		public void run() {
			System.out.println("쓰레드 이름: " + Thread.currentThread().getName());
			for(int i = 0; i < 20; i++) {
				System.out.print(no);
				// 시간 지연을 위한 for 문
				for(int j = 0; j < Integer.MAX_VALUE; j++) {}
			}
		}
	
}
public class _03Thread_이론3 {

		public static void main(String[] args) {
			
			Thread thread1 = new Thread(new ExThread(1));
			Thread thread2 = new Thread(new ExThread(2));
			Thread thread3 = new Thread(new ExThread(3));
			
			thread1.setName("쓰레드1");
			thread2.setName("쓰레드2");
			thread3.setName("쓰레드3");
			
//			JVM 에서 쓰레드 우선순위 권장
//			실제 스레드 컨트롤 하는 건 OS 에서 처리 한다.
//			우선 순위를 설정해도 OS 가 무시하면 의미가 없다.
			
//			우선 순위는 1~10. 높은 수록 우선 순위가 높다.
			thread1.setPriority(Thread.MIN_PRIORITY);	// 1
			thread1.setPriority(Thread.NORM_PRIORITY);	// 5 (기본값)
			thread1.setPriority(Thread.MAX_PRIORITY);	// 10
			
			thread1.start();
			thread2.start();
			thread3.start();
			
			
		}
}
