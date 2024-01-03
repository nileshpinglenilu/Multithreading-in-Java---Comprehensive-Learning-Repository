package CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Computation2 implements Runnable
{
	public static int sum = 0;
	public void run()
	{
		// check if newBarrier is broken or not 
        System.out.println("Is the barrier broken? - " + CyclicBarrier_Test.newBarrier.isBroken()); 
        sum = 200 + 300;
        try {
			CyclicBarrier_Test.newBarrier.await(3000, TimeUnit.MILLISECONDS);
			// number of parties waiting at the barrier 
            System.out.println("Number of parties waiting at the barrier "+ 
            "at this point = " + CyclicBarrier_Test.newBarrier.getNumberWaiting());
		} 
        catch (InterruptedException  | BrokenBarrierException  | TimeoutException e) 
        {
			e.printStackTrace();
		}
        
	}
}
