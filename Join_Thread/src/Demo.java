
public class Demo implements Runnable
{
	private String name;
	Demo(String s)
	{
		this.name = s;
	}
	@Override
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			try
            { 
                Thread.sleep(500); 
                System.out.println("Current Thread: at "+i+" "+name+ " is start");
            } 
  
            catch(Exception ex) 
            { 
                System.out.println("Exception has" + " been caught" + ex); 
            } 
		}
		System.out.println(name+" is Dead");
	}
}
