import java.util.ArrayList;

public class Listclass {
	private ArrayList<Character> elementos;
	
	public Listclass(){
		elementos=new ArrayList<Character>(); 
	}
	public void newfin(char a){
		elementos.add(a);
	}
	public void quitarespacios(){
		int i;
		for (i=0;i<elementos.size();i++){
			if(elementos.get(i)==' '){
				elementos.remove(i);
				i--;
			}
		}
		
	}
	public Boolean espalindromo(){
		int i=0;
		int j=elementos.size()-1;
		while((i<j)&&(elementos.get(i)==elementos.get(j))){
			i++;
			j--;
			
		}
		if(i>=j){
			return true;
		}else{
			return false;
		}
	}
	public int cuentaespacios(){
		int i;
		int contador=0;
		for(i=0;i<elementos.size();i++){
			if(elementos.get(i)== ' '){
				contador ++;
			}
		} 
		return contador;
	}
	public void invierte(){
		char aux;
		int i=0;
		int j=elementos.size()-1;
		while(i<j){
			aux=elementos.get(i);
			elementos.set(i, elementos.get(j));
			elementos.set(j, aux);
			i++;
			j--;
			
		}
		
	}
	
	public void estado(){
		for(int i=0;i<elementos.size();i++)
			System.out.println(elementos.get(i));
	}

}
