package javaDesktopSwing.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador { // extends Jframe

	public static void main(String[] args) {

		// Titulo da tela.
		JFrame janela = new JFrame("Observador");
		// Quando fechar a tela o programa para de executar.
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Tamanho da tela.
		janela.setSize(500, 300);
		// Coloca a janela no centro da tela do PC (Centraliza).
		janela.setLocationRelativeTo(null);
		// Ajusta o Layout, sem ele o botao cobre toda a tela vazia.
		janela.setLayout(new FlowLayout());
		// Botao do java.
		JButton botao = new JButton("Clicar");
		// Adiciona botao na janela.
		janela.add(botao);

		/*
		 * Evento do botao. 
		 * botao.addActionListener(new ActionListener() {
		 * 		// Quando ocorrer um evento ele retorna algo. 
		 * 		public void actionPerformed(ActionEvent e) { 
		 * 			System.out.println("Evento ocorreu!"); 
		 * 		} 
		 * });
		 */
		
		// Evento do botao opcao 2. 
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!!!!");
		});
		// Deixa janela visivel.
		janela.setVisible(true);
	}
}
