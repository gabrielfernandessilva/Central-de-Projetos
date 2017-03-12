package excecoes;

public class Validacao {
	
	public static void validaString(String string) throws ValidacaoException {
		if(string == null || string.trim().isEmpty()) {
			throw new ValidacaoException("Erro no cadastro de pessoa.");
		}
	}
	public static void validaEmail(String string) throws ValidacaoException {
		if(string == null || string.trim().isEmpty()) {
			throw new ValidacaoException("Erro na atualizacao de pessoa: Email invalido");
		}
		else if(!string.endsWith("@gmail.com") || !string.endsWith("@computacao.ufcg.edu.br") || 
				!string.endsWith("@ccc.ufcg.edu.br") || !string.endsWith("@yahoo.com.br") ||
				!string.endsWith("@bol.com.br")) {
			throw new ValidacaoException("Erro na atualizacao de pessoa: Email invalido");
		}
	}

	
	public static void validaNome(String string) throws ValidacaoException {
		if(string == null || string.trim().isEmpty()) {
			throw new ValidacaoException("Erro: nome nao pode ser nulo ou vazio");
		}
	}
	
	public static void validaObjetivo(String string) throws ValidacaoException {
		if(string == null || string.trim().isEmpty()) {
			throw new ValidacaoException("Erro: objetivo nao pode ser nulo ou vazio");
		}
	}
	
	public static void validaCpfUpdate(String cpf) throws ValidacaoException {
		if(cpf == null || cpf.trim().isEmpty()) {
			throw new ValidacaoException("Erro na atualizacao de pessoa: CPF nulo ou vazio");
		}
		
		String cpfForm = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
		
		if(!cpf.matches(cpfForm)) throw new ValidacaoException("Erro na atualizacao de pessoa: CPF invalido");
	} 
	
	public static void validaCpf(String cpf) throws ValidacaoException {
		if(cpf == null || cpf.trim().isEmpty()) {
			throw new ValidacaoException("Erro no cadastro de pessoa: CPF nulo ou vazio");
		}
		
		String cpfForm = "\\d\\d\\d.\\d\\d\\d.\\d\\d\\d-\\d\\d";
		
		if(!cpf.matches(cpfForm)) throw new ValidacaoException("Erro na atualizacao de pessoa: CPF invalido");
	} 
	
	public static void validaInt(int inteiro) throws ValidacaoException {
		if(inteiro <= 0) throw new ValidacaoException("Inteiro invalido para a operacao");
	}
	
	public static void validaData(int data) throws ValidacaoException {
		if(data <= 0) throw new ValidacaoException("Dia, mes ou ano nao podem ser 0");
	}
} 
		

