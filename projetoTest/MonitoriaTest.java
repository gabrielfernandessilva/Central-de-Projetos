package projetoTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import excecoes.ValidacaoException;
import projeto.Monitoria;

/**
 * Testes de unidade da classe Monitoria.
 * 
 * @author Gabriel Fernandes
 */
public class MonitoriaTest {
	private Monitoria mon;
	
	@Before
	public void setUp() throws Exception {
		mon = new Monitoria(0, "Monitoria de lp2", "lp2", 95, "auxiliar","2016.2", "01/01/2017", 12);
	}

	@Test
	public void construtorTest() throws ValidacaoException {
		assertEquals("Monitoria de lp2", mon.getNome());
		assertEquals("auxiliar", mon.getObjetivo());
		assertEquals("01/01/2017", mon.getDataInicio());
		assertEquals(12, mon.getDuracao());
		assertEquals(95, mon.getRendimento());
	}
	
	@Test
	public void construtorWithFailTest() {
		try {
			new Monitoria(0, "     ", "lp2", 95, "auxiliar","2016.2", "01/01/2017", 12);
			fail();
		}
		catch(ValidacaoException e) {
			assertEquals("Erro no cadastro de projeto: Nome nulo ou vazio",e.getMessage());
		}
		
		try {
			new Monitoria(0, "Monitoria de lp2", "lp2", 105, "auxiliar","2016.2", "01/01/2017", 12);
			fail();
		}
		catch(ValidacaoException e) {
			assertEquals("Rendimento precisa estar entre 0 e 100",e.getMessage());
		}
	}
	
	@Test
	public void setDisciplinaTest() throws ValidacaoException {
		mon.setDisciplina("Monitoria de plp");
		assertEquals("Monitoria de plp", mon.getDisciplina());
		
		try {
			mon.setDisciplina(" ");
			fail();
		}
		catch (ValidacaoException e) {
			assertEquals("Nome de disciplina nao pode ser nulo ou vazio", e.getMessage());
		}
	}
}