package lista1_ex2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Apliccation {
	public static void main(String[] args) {
	
	  ArrayList<String> lista = new ArrayList<String>();
	
	  
	for  (int i = 0; i < 10; i++) {
	   String mensagem = JOptionPane.showInputDialog("Posição:"+(i+1));
	   			lista.add(mensagem);
	}
	int i=0;
	   	for (String listar : lista) {
		
	   		i++;
	   		System.out.println("posição n_"+i+":"+listar);
		}
	}
}
