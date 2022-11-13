public class MyRun implements Runnable {
	private int id;

	public MyRun(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Thread id: " + id);
			try {
				//thread sleep for 100 milliseconds
				Thread.sleep(10000);
				Counter.totalNumberOfThreadsCreated ++;
				System.out.println("totalNumberOfThreadsCreated: " + Counter.totalNumberOfThreadsCreated);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
