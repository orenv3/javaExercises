package runnable;

public class Main {

	public static void main(String[] args) {

		/*
		 * Three type of implementing a thread/runnable
		 */

		MyThread th = new MyThread(); // regular
		MyThread2 th2 = new MyThread2();// Anonymous


		// Lambda
		Runnable rr = () -> {
			System.out.println("Runnable rr  from main");
			int i = 10;
			System.out.println("my int is " + i);
		};
		rr.run();


		// Anonymous
		Thread innerThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("innerThread from main");
			}
		});
		innerThread.run();
	}

}
