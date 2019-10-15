package com.yedam.lamda;

public class RunnableEx {

	public static void main(String[] args) {
		Runnable runnable = new Runnable() { // 익명구현객체
//			for(int i=0; i<10; i++) {
//				System.out.println(i);
//			}
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) { //러너블을 구현하는 객체
					System.out.println("a=> " + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};

		Thread thread = new Thread(runnable); //매개값으로 인터페이스가 들어올 수 있고
		thread.start();

		Thread thread2 = new Thread(() -> { 
			for (int i = 0; i < 5; i++) {
				System.out.println("b=> " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
		});
		
		thread2.start();

//		thread = new Thread(() -> { // 람다표현식이 매개값으로 올 수도 있음
//			System.out.println("anonymous runnable run");
//		});
//		thread.start();
	}

}
