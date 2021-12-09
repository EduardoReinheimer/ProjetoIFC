package info;

public class Info {
	private int id;
	private String descricao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if (descricao != null) {
			this.descricao = descricao;
		}

	}

	public Info(int id, String descricao) {
		setId(id);
		setDescricao(descricao);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Info [id=");
		builder.append(id);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}

}
