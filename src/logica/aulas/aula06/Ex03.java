package logica.aulas.aula06;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 1º nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 2º nota: "));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 3º nota: "));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a 4º nota: "));
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		if(media>=7) {
			JOptionPane.showMessageDialog(null, "Sua média é de: "+media+", você está aprovado!!!");
		
		}else if(media>=5 && media<7){
			JOptionPane.showMessageDialog(null, "Sua média é de: "+media+", você está de recuperação!!!");
		}else {
			
			JOptionPane.showMessageDialog(null, "Sua média é de: "+media+", você está reprovado!!!");
			
		}

	}

}
