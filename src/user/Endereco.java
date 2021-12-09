package user;

public class Endereco {
	private String rua;
	private int numero;
	private String complemento;

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		if (rua != null)
			this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0)
			this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		if (complemento != null)
			this.complemento = complemento;
	}

	public Endereco(String rua, int numero, String complemento) {
		super();
		setRua(rua);
		setNumero(numero);
		setComplemento(complemento);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [rua=");
		builder.append(rua);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", complemento=");
		builder.append(complemento);
		builder.append("]");
		return builder.toString();
	}

}
