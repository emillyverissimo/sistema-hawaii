package src.main.java.projeto.hawaiimodelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Departamento extends Loja {
	
	@Column(precision = 10, scale = 2, nullable = false)
	public String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp = 0;
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
	Departamento other = (Departamento) obj;
		
		if (nome == null) {
			if (other.nome != null)
				return false;
	
		} else if (!nome.equals(other.nome))
			return false;
		return false;
	
		
	}
	
}
