package Vetor;

public class Valor {
	private int info_id;
	private int vetor_id;
	private double valor;

	private int getInfo_id() {
		return info_id;
	}

	private void setInfo_id(int info_id) {
		if (info_id > 0)
			this.info_id = info_id;
	}

	private int getVetor_id() {
		return vetor_id;
	}

	private void setVetor_id(int vetor_id) {
		if (vetor_id > 0)
			this.vetor_id = vetor_id;
	}

	private double getValor() {
		return valor;
	}

	private void setValor(double valor) {
		if (valor > 0)
			this.valor = valor;
	}

	public Valor(int info_id, int vetor_id, double valor) {
		setInfo_id(info_id);
		setVetor_id(vetor_id);
		setValor(valor);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Valor [info_id=");
		builder.append(info_id);
		builder.append(", vetor_id=");
		builder.append(vetor_id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append("]");
		return builder.toString();
	}

}
