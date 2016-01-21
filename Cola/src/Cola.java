import java.util.LinkedList;

public class Cola<tipo> implements Queue<tipo>
{
	private LinkedList<tipo> L = new LinkedList<tipo>();
	
	public void clear_Queue()
	{
		L.clear();
	}

	public void push_Queue(tipo elem)
	{
		L.addLast(elem);
	}

	public void pop_Queue()
	{
		if(!L.isEmpty())
			L.removeFirst();
		else
			System.out.println("La Cola esta Vacia");
	}

	public boolean is_Empty_Queue()
	{
		return L.isEmpty();
	}

	public tipo get_Queue()
	{
		if(!L.isEmpty())
			return L.getFirst();
		else
			System.out.println("La Cola esta Vacia");
		return null;
	}
	
}
