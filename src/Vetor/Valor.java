package Vetor;

public class Valor {
	private Info info;
	private double valor;

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		if (info != null)
			this.info = info;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 0)
			this.valor = valor;
	}

	public Valor(Info info, double valor) {
		setInfo(info);
		setValor(valor);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Valor [info=");
		builder.append(info);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}

}
