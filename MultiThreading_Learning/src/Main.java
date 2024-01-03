
public class Main
{

//	public static void main(String[] args) 
//	{
//		System.out.println("Thread Start..!");
//		Thread2 th2 = new Thread2();
//		Thread th = new Thread(th2);  //Create thread class object
//		th.start();
//		System.out.println("Thread End..!");
//	}
//------------------Upper code is for normal Thread call, below code is for Lambda function-----
	public static void main(String args[])
	{
		System.out.println("Lambda Function Thread is Start");
		Thread th = new Thread(() -> {				//Compiler create runnable interface and provide implemention of run
													//method of this for loop
													
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread2 : "+i);
			}
		});
		th.start();
	}
}
