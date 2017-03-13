package pessoa;

import excecoes.Validacao;
import excecoes.ValidacaoException;

/**
 * 
 * Classe responsavel por moldar as caracteristicas de uma pessoa, tornando-a interativa em nosso
 * sistema
 * 
 * @author Gabriel Fernandes
 *
 */
public class Pessoa {
	private String cpf;
	private String nome;
	private String email;
	
	public Pessoa(String cpf, String nome, String email) throws ValidacaoException {
		Validacao.validaCpf(cpf);
		Validacao.validaString(nome);
		Validacao.validaEmail(email);
		
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setNome(String nome) throws ValidacaoException {
		Validacao.validaNome(nome);
		this.nome = nome;
	}
	
	public void setEmail(String email) throws ValidacaoException {
		Validacao.validaEmail(email);
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	@Override
	public String toString() {
		final String FIM_DE_LINHA = System.lineSeparator();
		return "Cpf: " + cpf + FIM_DE_LINHA + "Nome: " + nome + FIM_DE_LINHA + "Email: " + email
				+ FIM_DE_LINHA;
	}
}