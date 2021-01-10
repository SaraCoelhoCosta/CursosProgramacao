package br.com.cod3r.calculadora.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.cod3r.calculadora.modelo.Memoria;
import br.com.cod3r.calculadora.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel campoTexto;

	public Display() {
		Memoria.getInstancia().adicionarObservador(this); // Registra o diplay.
		setBackground(new Color(46, 49, 50)); // Cor de fundo.

		campoTexto = new JLabel(Memoria.getInstancia().getTextoAtual()); // Label.
		campoTexto.setForeground(Color.WHITE); // Cor da letra.
		campoTexto.setFont(new Font("arial", Font.PLAIN, 30)); // Fonte da letra.
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25)); // Alinhamento do texto.

		add(campoTexto); // Adicionando label.
	}

	@Override
	public void alterarValor(String novoValor) {
		campoTexto.setText(novoValor);
	}
}
