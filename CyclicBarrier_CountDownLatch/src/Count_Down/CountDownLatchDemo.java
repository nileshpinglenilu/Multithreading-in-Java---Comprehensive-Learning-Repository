package Count_Down;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo 
{ 
    public static void main(String args[])  
                   throws InterruptedException 
    { 
        // Let us create task that is going to  
        // wait for four threads before it starts 
        CountDownLatch latch = new CountDownLatch(4); 
  
        // Let us create four worker  
        // threads and start them. 
        Worker w1 = new Worker(1000, latch, "Worker 1");
        Worker w2 = new Worker(2000, latch, "Worker 2");
        Worker w3 = new Worker(3000, latch, "Worker 3");
        Worker w4 = new Worker(4000, latch, "Worker 4");
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w3);
        Thread t4 = new Thread(w4);
        
        //Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        // The main task waits for four threads 
        latch.await(); 
  
        // Main thread has started 
        System.out.println(Thread.currentThread().getName() +" has finished"); 
    } 
} 
  