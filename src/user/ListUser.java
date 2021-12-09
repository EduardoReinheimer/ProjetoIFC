package user;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import Vetor.Info;

public class ListUser {
	private List<User> lista = new ArrayList<User>();

	public List<User> getLista() {
		return lista;
	}

	public void setLista(List<User> lista) {
		if (lista != null)
			this.lista = lista;
	}
	public void add(User user) {
		lista.add(user);
	}

	
	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/users.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<User> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/users.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<User>>(){}.getType();
	    lista = new ArrayList<User>();
	    lista = new Gson().fromJson(bufferedReader, listType);
	    return lista;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListInfo [lista=");
		builder.append(lista);
		builder.append("]");
		return builder.toString();
	}

}
