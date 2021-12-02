package Vetor;

public class Main {

	public static void main(String[] args) {
		 ListInfo li = new ListInfo();
		    
		    Info media = new Info(1, "MEDIA");
		    li.add(media);
		    Info moda = new Info(2, "MODA");
		    li.add(moda);
		    
		    li.gravar();
		    
		    li = new ListInfo();
		    
		    li.setLista(li.ler());
		    
		    for (Info info : li.getLista()) {
				System.out.println(info);
			}

	}

}
