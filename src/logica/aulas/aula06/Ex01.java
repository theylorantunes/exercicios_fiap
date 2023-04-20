package logica.aulas.aula06;
import javax.swing.*;

public class Ex01 {
	public static void main (String args[]) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
		if(numero%2 == 0) {
			JOptionPane.showMessageDialog(null, "O número é par.");
		
		}else {
			JOptionPane.showMessageDialog(null, "O número é ímpar.");
		}
	}
}
