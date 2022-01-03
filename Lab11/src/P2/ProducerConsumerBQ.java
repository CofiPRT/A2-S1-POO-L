package P2;

import java.util.concurrent.*;

public class ProducerConsumerBQ {
	private static ArrayBlockingQueue<Integer> buffer = new ArrayBlockingQueue<Integer>(2);
	
	
	private static class ProducerTask implements Runnable {
		public void run() {
			try {
				int i = 1;
				while (true) {
					System.out.println("Producer writes " + i);
					buffer.put(i++);
					Thread.sleep((int)(Math.random() * 10000));
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	private static class ConsumerTask implements Runnable {
		public void run() {
			try {
				while (true) {
					System.out.println("\t\t\tConsumer reads "+ buffer.take() );
					Thread.sleep((int)(Math.random() * 10000));
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(new ProducerTask());
		executor.execute(new ConsumerTask());
		executor.shutdown();
		}
	
}


