package exercicios.quarto;

import java.util.Scanner;

public class second {
	
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		
		System.out.println("Olá "+nome+", você tem "+idade+" anos de idade.");
		
		entrada.close();
	}
	

}
