package pessoaTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excecoes.ValidacaoException;
import pessoa.PessoaController;

public class PessoaControllerTest {
	PessoaController pessoas;
	
	@Before
	public void setUp() throws Exception {
		pessoas = new PessoaController();
		pessoas.cadastraPessoa("222.333.444-55","Natasha","natasha@ccc.ufcg.edu.br");
	}

	@Test
	public void toStringTest() throws ValidacaoException {
		final String FIM_DE_LINHA = System.lineSeparator();
		assertEquals("Cpf: 222.333.444-55"
				   + FIM_DE_LINHA
				   + "Nome: Natasha"
				   + FIM_DE_LINHA
				   + "Email: natasha@ccc.ufcg.edu.br"
				   + FIM_DE_LINHA
				   ,pessoas.toString());
	}
}
