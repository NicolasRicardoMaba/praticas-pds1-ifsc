package lista1_ex1;

import javax.swing.JOptionPane;

public class Ex1 {

	public static void main(String[] args) {
		
		Ex1 ex = new Ex1();
	 Integer quantidadeLitros =	Integer.parseInt(JOptionPane.showInputDialog( "Litros:"));
	 float preco	= Float.parseFloat(JOptionPane.showInputDialog("Preço"));
	  
		float total = 0;
	
			JOptionPane.showMessageDialog(null, "Valor a Pagar:"+	ex.calctotal(total,quantidadeLitros, preco ));	
	
	}



	private float total;
	
	
	
	public Float calctotal(float total, int quantidadeLitros, float preco) {
		this.total = total;
		
		return  total =  quantidadeLitros*preco;
		
		
	}
	
	
}
