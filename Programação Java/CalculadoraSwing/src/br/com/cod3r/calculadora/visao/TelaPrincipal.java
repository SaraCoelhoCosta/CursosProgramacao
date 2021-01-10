package br.com.cod3r.calculadora.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {

	public TelaPrincipal() {
		setTitle("Calculadora"); // Titulo.
		setVisible(true); // Visibilidade da tela.
		setSize(232, 322); // Tamanho.
		setLocationRelativeTo(null); // Centraliza tela.
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Ativa botao de fechar para encerrar processo.
		
		organizarLayout();	
	}
	
	private void organizarLayout() {
		// Cria setores.
		setLayout(new BorderLayout());
		
		Display display = new Display(); // Instancia.
		display.setPreferredSize(new Dimension(233, 60)); // Define o tamanho.
		add(display, BorderLayout.NORTH); // Define o setor em que ele se localiza.

		Teclado teclado = new Teclado(); // Instancia.
		add(teclado, BorderLayout.CENTER); // Define o setor em que ele se localiza.
	}

	public static void main(String[] args) {
		new TelaPrincipal();
	}
}
