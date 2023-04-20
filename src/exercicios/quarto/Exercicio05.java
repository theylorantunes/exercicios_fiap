package exercicios.quarto;

import java.util.Scanner;

public class Exercicio05 {
	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu salário: ");		
		double salario = entrada.nextDouble();
		
		System.out.println("Seu salário: "+salario);
		
		
		System.out.print("Digite seu nome: ");
		System.out.println("Seu nome é: "+entrada.nextLine());
		
		entrada.close();
	}

}
