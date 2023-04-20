package logica.aulas.aula05;
import javax.swing.*;

public class Ex08 {

	public static void main(String[] args) {
		
		float dolar = 5.06f;
		float euro = 5.55f;
		float peso_arg = 0.023f;
		float libra = 6.30f;
		float iene = 0.038f;
		
		float reais = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual o valor em reais p/ ser convertido? "));
		System.out.printf("O valor R$ %.0f em conversão fica:\nDólar: $%.2f \nEuro: €%.2f \nPeso argentino: $%.2f\nLibra estrelina: £%.2f\nIene: ¥%.2f",reais,(reais/dolar),(reais/euro),(reais/peso_arg),(reais/libra),(reais/iene));
		
		
	}

}
