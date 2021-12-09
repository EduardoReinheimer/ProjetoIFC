package Vetor;

import java.util.ArrayList;

public class Vetor {
	private int id;
	private String title;
	private String itens;
	private ArrayList<Valor> valores;

	private int getId() {
		return id;
	}

	private void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	private String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		if (title != null)
			this.title = title;
	}

	private String getItens() {
		return itens;
	}

	private void setItens(String itens) {
		if (itens != null)
			this.itens = itens;
	}

	private ArrayList<Valor> getValores() {
		return valores;
	}

	private void setValores(ArrayList<Valor> valores) {
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
