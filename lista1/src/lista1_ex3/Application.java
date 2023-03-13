package lista1_ex3;

import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) {
		/*Considere um programa que deve calcular a média final (MF) de apenas um(a)
		discente com três notas (tipo Double) obtidas através do método showInputDialog 
		da classe JOptionPane. Ao final, o programa deve informar (usando showMessageDialog 
		da classe JOptionPane):
			Se MF >= 6: Aprovado(a)
			Se MF >= 4 e < 6: Recuperação
			Se MF < 4: Reprovado(a)
*/
	
		Double n1 =Double.parseDouble(JOptionPane.showInputDialog("Insira nota 1"));
		Double n2 =Double.parseDouble(JOptionPane.showInputDialog("Insira nota 2"));
		Double n3 =Double.parseDouble(JOptionPane.showInputDialog("Insira nota 3"));
	
		Double mf = ((n1+n2+n3)/3);  
		if (mf<4) {
			JOptionPane.showMessageDialog(null, "Reprovado");
			
			
		}
		else if(mf<=6 && mf> 4)
		{
			JOptionPane.showMessageDialog(null, "Recuperação");
	
	}
		else if(mf>=6){
			JOptionPane.showMessageDialog(null, "Aprovado");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nota Inválida");
		}
			
	}}
