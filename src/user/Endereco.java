package user;

public class Endereco {
	private int user_id;
	private String rua;
	private int numero;

	private String complemento;

	private int getUser_id() {
		return user_id;
	}

	private void setUser_id(int user_id) {
		if (user_id > 0)
			this.user_id = user_id;
	}

	private String getRua() {
		return rua;
	}

	private void setRua(String rua) {
		if (rua != null)
			this.rua = rua;
	}

	private int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		if (numero > 0)
			this.numero = numero;
	}

	private String getComplemento() {
		return complemento;
	}

	private void setComplemento(String complemento) {
		if (complemento != null)
			this.complemento = complemento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [user_id=");
		builder.append(user_id);
		builder.append(", rua=");
		builder.append(rua);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", complemento=");
		builder.append(complemento);
		builder.append("]");
		return builder.toString();
	}

	public Endereco(int user_id, String rua, int numero, String complemento) {
		super();
		setUser_id(user_id);
		setRua(rua);
		setNumero(numero);
		setComplemento(complemento);
	}

}
