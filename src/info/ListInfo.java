package info;

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

public class ListInfo {
	private List<Info> lista = new ArrayList<Info>();

	public List<Info> getLista() {
		return lista;
	}

	public void setLista(List<Info> lista) {
		if (lista != null)
			this.lista = lista;
	}
	public void add(Info info) {
		lista.add(info);
	}

	
	public void gravar() {
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer;
		try {
			writer = new FileWriter("json/infos.json");
			writer.write(gson.toJson(lista));
		    writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Info> ler() {
	    BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(
							 new FileReader("json/infos.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    Type listType = new TypeToken<ArrayList<Info>>(){}.getType();
	    lista = new ArrayList<Info>();
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
