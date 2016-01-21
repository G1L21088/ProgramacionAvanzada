import java.util.*;

public class ConvInfPos
{
	static final int OPERADOR = 1; 
	static final int OPERANDO = 2; 
	static final int PAR_AB = 3; 
	static final int PAR_CE = 4;
	@SuppressWarnings("unused")
	private LinkedList<String> L = new LinkedList<String>();
	private Pila<String> P = new Pila<String>();
	private Pila<String> Paux = new Pila<String>();
	private Pila<String> Postfija = new Pila<String>();
	
	private int tipo(String e)
	{
		int t;
		String token;
		
		token = e.substring(0,1);
		if(token.compareTo("(") == 0) 
			t = PAR_AB;
		else
		   if(token.compareTo(")") == 0)
			   t = PAR_CE;
		   else
			  if((token.compareTo("+") == 0) || (token.compareTo("-") == 0) || (token.compareTo("*") == 0) ||
				 (token.compareTo("/") == 0) || (token.compareTo("^") == 0) )
				  t = OPERADOR;
			  else
                  t = OPERANDO;
		return t;
	}
	
	public void convierte(LinkedList<String> L)
	{
		this.L = L;
		ListIterator<String> itr = L.listIterator();
		String e;
		
	    while(itr.hasNext())
	    {
	    	e = itr.next();
	    	
	    	switch(tipo(e))
	    	{
	    	case OPERANDO:
	    		Paux.pushStack(e);
	    		break;
	    	case PAR_AB:
	    		P.pushStack(e);
	    		break;
	    	case PAR_CE:
	    		while(!P.emptyStack() && (P.get_Stack().compareTo("(") != 0))
	    		{
	    			Paux.pushStack(P.get_Stack());
	    			P.popStack();
	    		}
	    		P.popStack();
	    		break;
	    	case OPERADOR:
	    		if(P.emptyStack())
	    			P.pushStack(e);
	    		else
	    		{
	    			while(prioridad(P.get_Stack()) >= prioridad(e))
	    			{
	    				Paux.pushStack(P.get_Stack());
	    				P.popStack();
	    			}
	    			P.pushStack(e);
	    		}
	    		break;
	    	}
	    }
	    while(!Paux.emptyStack())
	    {
	    	Postfija.pushStack(Paux.get_Stack());
	       	Paux.popStack();
	    }
	}
	
	private int prioridad(String e)
	{
		int t = 0;
		if(e.compareTo("(") == 0)
			t = 0;
		else
		{
			if((e.compareTo("+") == 0) || (e.compareTo("-") == 0))
				t = 1;
			else
				if((e.compareTo("*") == 0) ||(e.compareTo("/") == 0))
					t = 2;
				else
					if((e.compareTo("^") == 0))
						t = 3;
		}
		return t;
	}
	
	public String showInf()
	{
		String s = "";
		while(!Postfija.emptyStack())
		{
			   s += (Postfija.get_Stack() + " ");
			   Postfija.popStack();
		}	
		return s;
	}
	
	public String expresion(String exp)
	{
		{
			String expresion;
			StringTokenizer st;
			LinkedList<String> L = new LinkedList<String>();
			expresion = exp;
			st = new StringTokenizer("( " + expresion + " )");
			while(st.hasMoreTokens())
			{
			   L.add(st.nextToken());
			}
			convierte(L);
			return showInf();
		}
	}
}
