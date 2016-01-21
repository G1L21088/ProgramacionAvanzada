import java.util.*;

public class ConvInfijaPosfija
{
	static final int OPERADOR =1; 
	static final int OPERANDO =2; 
	static final int PAR_AB =3; 
	static final int PAR_CE =4;
	
	@SuppressWarnings("unused")
	private LinkedList<String> L = new LinkedList<String>();
	Pila<String> P = new Pila<String>();
	Pila<String> Paux = new Pila<String>();
	
	int tipo(String elem){
		int t;
		String token;
		
		token=elem.substring(0,1);  //obtiene el primer caracter del string elem (como substring)
		if(token.compareTo("(") == 0) 
			t=PAR_AB;
		else
		   if(token.compareTo(")") == 0)
			   t=PAR_CE;
		   else
			  if((token.compareTo("+") == 0) || (token.compareTo("-") == 0) || (token.compareTo("*") == 0) ||
				 (token.compareTo("/") == 0) || (token.compareTo("^") == 0) )
				  t= OPERADOR;
			  else
                  t=OPERANDO;
		return t;
	}
	
	public void convierte(LinkedList <String> L){ //por ahora es de tipo void, la conversion se despliega en pantalla
		this.L = L;
		ListIterator<String> itr = L.listIterator();
		String elem;
		
		System.out.println("Elementos de L:");
	    while(itr.hasNext()){
	    	   elem=itr.next();
	    	   switch(tipo(elem)){
	    	   case OPERANDO://System.out.println(" "+elem+" : OPERANDO"); 
	    	       P.push(elem);
	    	   break;
	    	   case PAR_AB://System.out.println(" "+elem+" : PAR_AB");
	    		   Paux.push(elem);
	    		   break;
	    		   
	    	   case PAR_CE://System.out.println(" "+elem+" : PAR_CE"); 
	    	   while(!Paux.esVaciaP() && Paux.valorTope().compareTo("(")!= 0){
    			   P.push(Paux.valorTope());
    			   Paux.pop();
    		   }
    		   Paux.pop();
    		   break;	
	    	   
	    	   case OPERADOR://System.out.println(" "+elem+" : OPERADOR");
	    	  
	    	   	if(Paux.esVaciaP())
	    	   	 Paux.push(elem);
	    	   	else{
	    	   		while(prioridad(Paux.valorTope())>= prioridad(elem)){
	    	   			P.push(Paux.valorTope());
	    	   			Paux.pop();
	    	   		}
	    	   		Paux.push(elem);
	    	   		/*if(prioridad(elem)>=prioridad(Paux.valorTope())){
	    			   Paux.push(elem);
	    		    }
	    	   		else{
	    			   P.push(elem);
	    		    }*/
	    	   	}
	    	   	break;
	    	   }
	    	   	
	    	   	}
	    while(!Paux.esVaciaP()){
	    	   		P.push(Paux.valorTope());
	    	   		Paux.pop();
	    }
	    
		System.out.println(" ");
		despliega_pila(P);
		
		

	}
	public int prioridad(String elem){
		int t = 0;
		if(elem.compareTo("(") == 0) 
			t = 0;
		else{
			 if((elem.compareTo("+") == 0) || (elem.compareTo("-") == 0)) 
				  t = 1;
			  else
                  if((elem.compareTo("*") == 0) ||(elem.compareTo("/") == 0))
                	  t = 2;
                  else{
                	  if((elem.compareTo("^") == 0) )
                	  t = 3;
                  }
		}
		return t;
	}
	void despliega_pila(Pila <String> P){
		while(!P.esVaciaP()){
			   Paux.push(P.valorTope());
			   P.pop();
		}
		while(!Paux.esVaciaP()){
			   System.out.print(" "+Paux.valorTope());
			   Paux.pop();
		}
		
	}

}