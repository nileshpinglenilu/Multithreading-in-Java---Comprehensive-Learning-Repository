
public class ShutDownHook {

	public static void main(String[] args)
	{
		Runtime.getRuntime().addShutdownHook(new Thread()
				{
					public void run()
					{
						System.out.println("Shut Down Hook is Running..!");
					}
				});
		System.out.println("Application is Terminating");
	}

}
