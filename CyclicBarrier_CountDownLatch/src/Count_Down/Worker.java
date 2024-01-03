package Count_Down;

import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable
{
	private int delay; 
    private CountDownLatch latch;
    private String name;
    public Worker(int delay, CountDownLatch latch, String n) 
	{ 
		this.name = n;
		this.delay = delay; 
		this.latch = latch; 
	} 
    public void run() 
    { 
        try
        { 
            Thread.sleep(delay); 
            latch.countDown(); 
            System.out.println(Thread.currentThread().getName() 
                            + " it finished after "+delay); 
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
}
