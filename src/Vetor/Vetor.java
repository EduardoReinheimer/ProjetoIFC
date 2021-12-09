package Vetor;

import java.util.ArrayList;

public class Vetor {
	private int id;
	private String title;
	private String itens;
	private ArrayList<Valor> valores;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null)
			this.title = title;
	}

	public String getItens() {
		return itens;
	}

	public void setItens(String itens) {
		if (itens != null)
			this.itens = itens;
	}

	public ArrayList<Valor> getValores() {
		return valores;
	}

	public void setValores(ArrayList<Valor> valores) {
		if (valores != null)
			this.valores = valores;
	}

	public Vetor(int id, String title, String itens, ArrayList<Valor> valores) {
		setTitle(title);
		setId(id);
		setItens(itens);
		setValores(valores);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vetor [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", itens=");
		builder.append(itens);
		builder.append(", valores=");
		builder.append(valores);
		builder.append("]");
		return builder.toString();
	}
	
	

}
