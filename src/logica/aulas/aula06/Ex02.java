package logica.aulas.aula06;

import javax.swing.*;

public class Ex02 {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número:"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um outro número:"));
		
		if(numero1>numero2) {
			JOptionPane.showMessageDialog(null, "O 1º número é maior.");
		
		}else if(numero2>numero1){
			JOptionPane.showMessageDialog(null, "O 2º número é maior.");
		}else {
			
			JOptionPane.showMessageDialog(null, "Os número são iguais.");
			
		}
		
		
		
	}

}
