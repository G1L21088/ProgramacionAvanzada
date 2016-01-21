import java.util.*;

public class Pila<tipo> implements Stack<tipo>
{
	private LinkedList<tipo> L = new LinkedList<tipo>();

	public void popStack()
	{
		if(L.isEmpty())
			System.err.println("No hay datos");
		else
			L.removeFirst();
	}

	public void clearStack()
	{
		L.clear();
	}

	public void pushStack(tipo e)
	{
		L.addFirst(e);
	}

	public boolean emptyStack()
	{
		return L.isEmpty();
	}

	public tipo get_Stack()
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
