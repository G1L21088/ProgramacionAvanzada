import java.util.*;

public class Cola<tipo> implements Queue<tipo>
{
	private LinkedList<tipo> L = new LinkedList<tipo>();

	public void popQueue()
	{
		if(L.isEmpty())
			System.err.println("No hay datos");
		else
			L.removeFirst();
	}

	public void clearQueue()
	{
		L.clear();
	}

	public void pushQueue(tipo e)
	{
		L.addLast(e);
	}

	public boolean emptyQueue()
	{
		return L.isEmpty();
	}

	public tipo get_Queue()
	{
		if(!L.isEmpty())
			return L.getFirst();			
		else
		{
			System.err.println("No hay datos");
			return null;
		}
	}
}
