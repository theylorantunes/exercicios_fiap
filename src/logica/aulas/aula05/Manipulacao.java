package logica.aulas.aula05;


import java.util.Scanner;

public class Manipulacao {
	public static void main (String args[]) {
		
		
		Scanner entrada = new Scanner(System.in);
				
		double salario = 1300.50;
		String salarioStr = Double.toString(salario);
		
		System.out.println(salarioStr.getClass().getSimpleName());
		
		
		String idade = "25";
		
		int idadeInt = Integer.parseInt(idade);
		System.out.println(idadeInt);
		
		
		System.out.print("Digite o preço do produto: ");
		String preco = entrada.nextLine();
		
		float precoFloat = Float.parseFloat(preco);
		
		System.out.println(precoFloat);
		
		entrada.close();
		
		
		
	}
}
