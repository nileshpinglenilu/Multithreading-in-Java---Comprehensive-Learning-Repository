
public class Main {

	public static void main(String[] args) 
	{
		Stack stack = new Stack(5);
		// following is Lambda function for creating Thread uisng Runnable Interface, you can see lambda function
		//is nothing but implementation of run method. Normally we create new class and implement Runnable interface
		// but here instead of we directly created new Thread with Runnable interface with give run method implementation
		
		System.out.println("Thread Start...!");
		new Thread(() -> {
			int counter = 0;
			while(++counter<10)
			{
				System.out.println("Pushed: "+stack.push(100));
			}
		}).start();
		
		new Thread(() ->{
			int counter = 0;
			while(++counter<10)
			{
				System.out.println("Popped: "+stack.pop());
			}
		}).start();
		
		System.out.println("Thread End...!");
	}

}
