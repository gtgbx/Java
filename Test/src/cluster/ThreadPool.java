package cluster;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {
		BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>();

		ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 6, 1,
				TimeUnit.DAYS, queue);
		for (int i = 0; i < 20; i++) {

			executor.execute(new Runnable() {
				public void run() {

					try {

						Thread.sleep(1000);

					} catch (InterruptedException e) {

						e.printStackTrace();

					}
					System.out.println(String.format("thread %d finished",
							this.hashCode()));
				}
			});
		}

		executor.shutdown();

	}

}
