package logica.aulas.aula06;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {

		int data_nasc = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu ano de nascimento: "));
		int idade = 2023-data_nasc;
		
		if(idade<16) {
			
			JOptionPane.showMessageDialog(null, "Seu voto é proibido!");
			
		}else if(idade>15 && idade<18) {
			
			JOptionPane.showMessageDialog(null, "Seu voto é opcional!");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Seu voto é obrigatório!");
			
		}
	}

}
