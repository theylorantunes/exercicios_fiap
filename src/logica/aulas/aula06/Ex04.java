package logica.aulas.aula06;

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 1º numero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o 2º numero: "));
		
		int multi = num1 % num2;
		
		if(multi == 0) {
			
			JOptionPane.showMessageDialog(null, "Os números são múltiplos.");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Os números não são múltiplos.");
		}

	}

}
