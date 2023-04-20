package logica.aulas.aula05;
import javax.swing.*;

public class Ex06 {

	public static void main(String[] args) {
		
		int qtd_peca1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas peça1 você quer?"));
		double pco_peca1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor unitário de peça1: "));
		
		int qtd_peca2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas peça2 você quer?"));
		double pco_peca2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor unitário de peça2: "));
		
		
		JOptionPane.showMessageDialog(null, "Você quer "+qtd_peca1+" unidades de peça1 e "+qtd_peca2+" unidades de peça2.\nO valor total a se pagar vai ser de: R$ "+((qtd_peca1*pco_peca1)+(qtd_peca2*pco_peca2)));
	}

}
