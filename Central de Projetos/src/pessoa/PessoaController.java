package pessoa;

import java.util.HashSet;

import excecoes.ValidacaoException;

public class PessoaController {
	private HashSet<Pessoa> pessoas;
	
	public PessoaController() {
		this.pessoas = new HashSet<>();
	}
	
	public void addPessoa(String cpf, String nome, String email) throws ValidacaoException {
			Pessoa p = new Pessoa(cpf,nome,email);
			this.pessoas.add(p);
			

	}
	
	
}
