package logica.aulas.aula06;
import javax.swing.*;

public class Ex08 {

	public static void main(String[] args) {
		
		float quilometragem = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o total em KM percorrido: "));
		int litro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quanto de combustivel foi gasto (L): "));
		
		float autonomia = quilometragem/litro;
		
		if(autonomia<8) {
			JOptionPane.showMessageDialog(null,"Esse carro bebe hein!");
		}else {
			JOptionPane.showMessageDialog(null,"Autonomia legal!");
		}

	}

}
