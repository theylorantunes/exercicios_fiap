package logica.aulas.aula05;

import javax.swing.JOptionPane;

public class Ex10 {
	public static void main(String args[]) {
		
		int anos = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos anos voce ja viveu?:"));
		int meses = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos meses voce ja viveu?:"));
		int dias = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos dias voce ja viveu?:"));
		
		JOptionPane.showMessageDialog(null, "Você já viveu: "+((anos*365)+(meses*30)+(dias))+" dias.");
	}
}
