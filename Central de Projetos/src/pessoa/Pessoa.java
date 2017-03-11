package pessoa;

import excecoes.Validacao;
import excecoes.ValidacaoException;

public class Pessoa {
	private String cpf;
	private String nome;
	private String email;
	
	public Pessoa(String cpf, String nome, String email) throws ValidacaoException {
		Validacao.validaCpf(cpf);
		Validacao.validaString(nome);
		Validacao.validaString(email);
		
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
	
	public Boolean setNome(String nome) {
		try {
			Validacao.validaString(nome);
			this.nome = nome;
			return true;
		}
		catch (ValidacaoException e) {
			return false;
		}
	}
	
	public Boolean setEmail(String email) {
		try {
			Validacao.validaString(email);
			this.nome = email;
			return true;
		}
		catch (ValidacaoException e) {
			return false;
		}
	}
	
}