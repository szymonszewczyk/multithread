/**
 * https://javastart.pl/baza-wiedzy/java-zaawansowane/watki-wprowadzenie-i-przyklad
 */
public class Runner {
	public static void main(String[] args) {
		int numberOfThreadsTobeCreated = 3;
		Runnable[] runners = new Runnable[numberOfThreadsTobeCreated];
		Thread[] threads = new Thread[numberOfThreadsTobeCreated];

		for(int i = 0; i < numberOfThreadsTobeCreated; i++) {
			runners[i] = new MyRun(i);
		}

		for(int i = 0; i < numberOfThreadsTobeCreated; i++) {
			threads[i] = new Thread(runners[i]);
		}

		for(int i = 0; i < numberOfThreadsTobeCreated; i++) {
			threads[i].start();
		}
	}
}
