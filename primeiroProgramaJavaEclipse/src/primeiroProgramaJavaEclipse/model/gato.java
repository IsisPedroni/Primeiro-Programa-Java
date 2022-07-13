package primeiroProgramaJavaEclipse.model;

import java.util.Objects;

public class gato {

	private String nome;
	private String cor;
	private Integer idade;

	public gato() {
	}

	public gato(String nome, String cor, Integer idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		gato other = (gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

}
