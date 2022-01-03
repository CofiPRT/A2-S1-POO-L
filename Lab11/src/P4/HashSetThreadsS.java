package P4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetThreadsS {

	static Set<Integer> hs = Collections.synchronizedSet(new HashSet<Integer>());
	static int i = 0;
		
	public static class AddTask implements Runnable {
	
	@Override
	public void run() {
		synchronized (hs)
		{
			while (i<5000)
				hs.add(i++);
		}
	}
	}
	
	public static class IterateTask implements Runnable 
	{
				
		@Override
		public void run() {
			synchronized (hs)
			{
				Iterator<Integer> iterator = hs.iterator();
				while (iterator.hasNext()) 
						System.out.println(iterator.next());
				
			}
		}
	}
	
	public static void main (String[] args)
	{
		
		Thread t1 = new Thread (new HashSetThreadsS.AddTask());
		Thread t2 = new Thread (new HashSetThreadsS.IterateTask());
		
		t1.start();
		t2.start();
	}
	
}
