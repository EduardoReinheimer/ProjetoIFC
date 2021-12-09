package Vetor;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Info media = new Info(1, "MEDIA");
		Info moda = new Info(2, "MODA");
		
		Valor v1 = new Valor(media, 23.0);
		Valor v2 = new Valor(moda, 25.0);
		
		ArrayList<Valor> valores = new ArrayList<Valor>();
		valores.add(v1);
		valores.add(v2);
		
		Vetor v = new Vetor(1, "Vetor1", "1;2;3", valores);
		
		ListVetor li = new ListVetor();
		
		li.add(v);
	    
	    li.gravar();
	    
	    li = new ListVetor();
	    
	    li.setLista(li.ler());
	    
	    for (Vetor vetor : li.getLista()) {
			System.out.println(vetor);
		}

	}

}
