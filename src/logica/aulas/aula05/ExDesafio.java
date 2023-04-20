package logica.aulas.aula05;

import javax.swing.JOptionPane;

public class ExDesafio {

	public static void main(String[] args) {
		
		
		int idadeDias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade em dias: "));
		
		int anos = idadeDias/365;
		idadeDias %= 365;

        int meses = idadeDias/30;
        idadeDias %= 30;

        int dias = idadeDias;
        
        JOptionPane.showMessageDialog(null, "Voce já viveu: "+anos+" anos, "+meses+" meses e "+dias+" dias de vida.");

	}

}
