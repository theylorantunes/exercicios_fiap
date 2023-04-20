package logica.aulas.aula05;
import javax.swing.*;

public class Ex09 {
	public static void main (String args[]) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número (até 999):"));
		
		int centena = num / 100;
        int dezena = (num % 100) / 10;
        int unidade = num % 10;
        
        JOptionPane.showMessageDialog(null, "Centena: "+(centena*100)+"\nDezena: "+(dezena*10)+"\nUnidade: "+(unidade));
	}
}
