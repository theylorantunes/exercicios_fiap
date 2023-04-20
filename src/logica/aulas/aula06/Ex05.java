package logica.aulas.aula06;

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 1º numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 2º numero: "));
		
		String operacao = JOptionPane.showInputDialog(null,"Digite uma das 4 operações matematicas (+, -, *, /): ");
		
		switch(operacao) {
		
		case "+":
			JOptionPane.showMessageDialog(null, num1+num2);
		break;
		
		case "-":
			JOptionPane.showMessageDialog(null, num1-num2);
		break;
		
		case "*":
			JOptionPane.showMessageDialog(null, num1*num2);
		break;
		
		case "/":
			JOptionPane.showMessageDialog(null, num1/num2);
		break;
		default:
			JOptionPane.showMessageDialog(null, "Operação inválida.");
		}
	}

}
