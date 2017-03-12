package projetoTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excecoes.ValidacaoException;
import projeto.Date;
import projeto.Projeto;

public class ProjetoTest {
	Projeto proj;

	@Before
	public void setUp() throws Exception {
		proj = new Projeto("Computacao Quantica","Desenvolver estudos na area da computacao quantica",
				"02/02/2017",12);
	}

	@Test
	public void construtortest() throws ValidacaoException {
		assertEquals("Computacao Quantica",proj.getNome());
		assertEquals("Desenvolver estudos na area da computacao quantica",proj.getObjetivo());
		assertEquals(new Date("02/02/2017"),proj.getDataInicio());
		assertEquals(12,proj.getDuracao());
	}
	
	@Test
	public void construtorWithFailTest() {
		try {
			new Projeto("       ","Desenvolver estudos na area da computacao quantica",
					"02/02/2017",12);
			fail();
		}
		catch(ValidacaoException e) {
			assertEquals("Erro: nome nao pode ser nulo ou vazio",e.getMessage());
		}
	}
}
