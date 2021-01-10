package br.com.cod3r.calculadora.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{
	
	public Botao(String campoTexto, Color cor) {
		setText(campoTexto);
		setFont(new Font("arial", Font.PLAIN, 25)); // Fonte da letra.
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}

}
