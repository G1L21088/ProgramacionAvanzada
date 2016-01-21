import java.util.*;

public class Evaluar
{
	static final int OPERADOR = 1;
	static final int OPERANDO = 2;
	@SuppressWarnings("unused")
	private LinkedList<String> L = new LinkedList<String>();
	private Pila<String> E = new Pila<String>();
	private Pila<String> P = new Pila<String>();
	
	public String evaluacion(String post)
	{
		String expresion;
		StringTokenizer st;
		LinkedList<String> L = new LinkedList<String>();
		expresion = post;
		st = new StringTokenizer("( " + expresion + " )");
		while(st.hasMoreTokens())
		{
		   L.add(st.nextToken());
		}
		return eval(L);
	}
  
	public String eval(LinkedList<String> L)
	{
		this.L = L;
		ListIterator<String> itr = L.listIterator();
		String e;
		
	    while(itr.hasNext())
	    {
	    	e = itr.next();
	    	E.pushStack(e);
	    }
	    
	    while (!E.emptyStack())
	    {
	    	if((E.get_Stack().compareTo("+") == 0) || (E.get_Stack().compareTo("-") == 0) || (E.get_Stack().compareTo("*") == 0) ||
				 (E.get_Stack().compareTo("/") == 0) || (E.get_Stack().compareTo("^") == 0))
	    	{
	    		P.pushStack(evaluar(e(), p(), p()) + "");
	    	}
	    	else
	    	{
	    		P.pushStack(e());
	    	}
	    }
	    return P.get_Stack();
	}
	
	public String e()
	{
		String e = E.get_Stack();
		E.popStack();
		return e;
	}

	public String p()
	{
		String e = P.get_Stack();
		P.popStack();
		return e;
	}

	private static String evaluar(String op, String n2, String n1)
	{
		double num1 = Float.parseFloat(n1);
		double num2 = Float.parseFloat(n2);
		String res = "0";
		if (op.compareTo("+") == 0) 
			res = String.valueOf(num1 + num2);
		if (op.compareTo("-") == 0) 
			res = String.valueOf(num1 - num2);
		if (op.compareTo("*") == 0) 
			res = String.valueOf(num1 * num2);
		if (op.compareTo("/") == 0) 
			res = String.valueOf(num1 / num2);
		if (op.compareTo("^") == 0)
			res = String.valueOf(Math.pow(num1, num2));
		return res;
	}
}