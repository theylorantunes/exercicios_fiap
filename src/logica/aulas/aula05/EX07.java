package logica.aulas.aula05;
import javax.swing.*;

public class EX07 {
	
	public static void main (String args[]) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor do produto?"));
		double pago = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valor pago?"));
		
		JOptionPane.showMessageDialog(null, "O seu troco é de: R$ "+(pago-valor));
		
		// nao estou utilizando if porque ainda nao foi pedido!!!!
		
	}

}
