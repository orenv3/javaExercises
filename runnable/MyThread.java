package runnable;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Theread from class MyThread");
	}

	public MyThread() {
		this.run();
	}

}
