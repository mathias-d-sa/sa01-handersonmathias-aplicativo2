package br.com.javatagua.sa1.app3;

import javax.swing.JOptionPane;

import br.com.javatagua.sa1.bo.AssentoBO;

public class Principal {

	public static void main(String[] args) {
		
		String resp = JOptionPane.showInputDialog("Digite a quantidade de aviões: ");
		
		// Converte a resposta para "Inteiro"
		int qtdeAvioes = Integer.parseInt(resp);
		
		AssentoBO abo = new AssentoBO();
		
		JOptionPane.showMessageDialog(null, "A quantidade de assentos totais é de: " + abo.calcularAssentos(qtdeAvioes));
	}

}
