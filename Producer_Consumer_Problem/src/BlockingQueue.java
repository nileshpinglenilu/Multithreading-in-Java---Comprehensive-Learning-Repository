import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue 
{
	private Queue<Integer> q;
	private int capacity;
	public BlockingQueue(int cap)
	{
		cap = capacity;
		q = new LinkedList<>();
	}
	public boolean add(int item)
	{
		synchronized (q)
		{
			while(q.size()==capacity)
			{
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			q.notifyAll();                      // notify all thread who are waiting()
			q.add(item);
			return true;
		}
		
	}
	public int remove()
	{
		synchronized (q)
		{
			while(q.size()==0)
			{
				try {					// q.wait until some will add element,and revoke notifyAll()
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			int num = q.poll();
			q.notifyAll();
			return num;
		}
	}
}
