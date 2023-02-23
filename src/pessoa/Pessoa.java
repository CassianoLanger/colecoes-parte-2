package pessoa;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pessoa {

	private String nome;
	private char genero;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, char genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "nome= " + nome ;
	}
	
	
	
}
