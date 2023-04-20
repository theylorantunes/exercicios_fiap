package logica.aulas.aula05;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean verificaSenha = false;
		boolean verificaEmail = true;
		
		boolean logicaE = verificaEmail || verificaSenha;
		System.out.println(logicaE);
		
		
		boolean negacao = !true;
		
		System.out.println(!negacao);
	}

}
