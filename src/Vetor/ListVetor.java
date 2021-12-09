package Vetor;

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

import user.User;

public class ListVetor {
	private List<Vetor> lista = new ArrayList<Vetor>();

	public List<Vetor> getLista() {
		return lista;
	}

	public void setLista(List<Vetor> lista) {
		if (lista != null)
			this.lista = lista;
	}
	public void add(Vetor vetor) {
		lista.add(vetor);
	}

	
	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/vetores.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Vetor> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/vetores.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Vetor>>(){}.getType();
	    lista = new ArrayList<Vetor>();
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
