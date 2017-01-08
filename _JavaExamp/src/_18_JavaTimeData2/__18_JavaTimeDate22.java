package _18_JavaTimeData2;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class __18_JavaTimeDate22 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addThreadsToPool();
	}
		
		public static void addThreadsToPool(){
			ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);
			
			
			eventPool.scheduleAtFixedRate(new CheckSysytemTime(), 0, 2, TimeUnit.SECONDS);
			eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, TimeUnit.SECONDS);
			eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, TimeUnit.SECONDS);
			
			System.out.println("Number of Threads " + Thread.activeCount());
			
			Thread[] listOfThreads = new Thread[Thread.activeCount()];
			
			Thread.enumerate(listOfThreads);
			
			for(Thread i : listOfThreads){
				System.out.println(i.getName());
			}
			
			for(Thread i : listOfThreads){
				System.out.println(i.getPriority());
			}
			
			//eventPool.shutdown();
			
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}
		}

	}
