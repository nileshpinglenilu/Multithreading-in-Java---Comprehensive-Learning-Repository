package CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

public class Computation1 implements Runnable
{
	public static int product = 0;
	public void run()
	{
		product = 10 * 20;
		try {
			CyclicBarrier_Test.newBarrier.await();  // call await method
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		} 
	}
}
