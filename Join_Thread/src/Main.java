
public class Main 
{
	public static void main(String args[])
	{
		Demo obj1 = new Demo("Thread 1");
		Demo obj2 = new Demo("Thread 2");
		Demo obj3 = new Demo("Thread 3");
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		Thread t3 = new Thread(obj3);
		
		t1.start();  //thread 1 is Start
		
		try
		{
			t1.join();  // next thread start after thread 1 is terminated
		} 
		catch (InterruptedException e) {		
			e.printStackTrace();
		}  
		t2.start();
		try 
		{			
			t2.join();  // next thread start after thread 2 is terminated
		} 
		catch (InterruptedException e) {			
			e.printStackTrace();
		}
		t3.start();
	}
}
