
public class ShutDownHook2 
{
	public static void main(String args[]) 
	{
		Runtime current = Runtime.getRuntime();
		Demo obj = new Demo();
        current.addShutdownHook(obj);
        for(int i = 1; i <= 10; i++)  
        {
        	System.out.println("2 X " + i + " = " + 2 * i);
        }
        System.out.println("Main Thread Operation done time to close JVM..!");
             
	}
}
