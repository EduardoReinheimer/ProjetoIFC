package user;

public class User {
	private int id;
	private String username;
	private String password;
	private Endereco endereco;

	private int getId() {
		return id;
	}

	private void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	private String getUsername() {
		return username;
	}

	private void setUsername(String username) {
		if (username != null)
			this.username = username;
	}

	private String getPassword() {
		return password;
	}

	private void setPassword(String password) {
		if (password != null)
			this.password = password;
	}

	private Endereco getEndereco() {
		return endereco;
	}

	private void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}

	public User(int id, String username, String password, Endereco endereco) {
		setId(id);
		setUsername(username);
		setPassword(password);
		setEndereco(endereco);
	}

}
