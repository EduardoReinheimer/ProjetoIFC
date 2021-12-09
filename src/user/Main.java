package user;

import java.util.ArrayList;
import java.util.List;

import info.Info;
import info.ListInfo;

public class Main {

	public static void main(String[] args) {
		List<User> usuarios = new ArrayList<User>();
		
		Endereco e = new Endereco(1, "Rua Coorea Pinto", 89, "kt02");
		User u = new User(1, "ademir", "999999", e);
		
		ListUser li = new ListUser();
		
		li.add(u);
	    
	    li.gravar();
	    
	    li = new ListUser();
	    
	    li.setLista(li.ler());
	    
	    for (User user : li.getLista()) {
			System.out.println(user);
		}
		
		

	}

}
