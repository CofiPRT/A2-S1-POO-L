package P3;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetThreads {

	static HashSet<Integer> hs = new HashSet<Integer>();
	static int i = 0;
		
	public static class AddTask implements Runnable {
	
	@Override
	public void run() {
		while (i<5000)
			hs.add(i++);
		}
	}
	
	public static class IterateTask implements Runnable 
	{
				
		@Override
		public void run() {
			Iterator<Integer> iterator = hs.iterator();
			while (iterator.hasNext()) 
					System.out.println(iterator.next());
				
			}
	}
	
	public static void main (String[] args)
	{
		
		Thread t1 = new Thread (new HashSetThreads.AddTask());
		Thread t2 = new Thread (new HashSetThreads.IterateTask());
		
		t1.start();
		t2.start();
	}
	
}
