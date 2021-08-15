package runnable;

public class MyThread2 {

//		Runnable run = 
	public MyThread2() {
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Theread runaable from MyThread2");
			}
		});

		th.run();
	}
}
