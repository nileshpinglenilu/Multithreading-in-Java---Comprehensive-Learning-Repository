package CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_Test implements Runnable
{
	public static CyclicBarrier newBarrier = new CyclicBarrier(3); 

	public static void main(String[] args) 
	{
		//Parent Thread
		CyclicBarrier_Test obj = new CyclicBarrier_Test();
		Thread t1 = new Thread(obj);
		t1.start();
	}
	public void run()
	{
		 System.out.println("Number of parties required to trip the barrier = "+ newBarrier.getParties()); 
		 System.out.println("Sum of product and sum = " + (Computation1.product + Computation2.sum)); 
			          
		// objects on which the child thread has to run
		 Computation1 c1 = new Computation1();
		 Computation2 c2 = new Computation2();
		 Thread t2 = new Thread(c1);
		 Thread t3 = new Thread(c2);
		 t2.start();
		 t3.start();
		 
		 try {
			CyclicBarrier_Test.newBarrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		} 
		 
		 // barrier breaks as the number of thread waiting for the barrier 
	        // at this point = 3 
	        System.out.println("Sum of product and sum = " + (Computation1.product +  
	        Computation2.sum)); 
	                  
	        // Resetting the newBarrier 
	        newBarrier.reset(); 
	        System.out.println("Barrier reset successful");
	}

}
