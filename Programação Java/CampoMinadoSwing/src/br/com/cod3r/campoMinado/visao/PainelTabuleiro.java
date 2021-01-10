package br.com.cod3r.campoMinado.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.cod3r.campoMinado.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		tabuleiro.paraCadaCampo(campo -> add(new BotaoCampo(campo)));

		tabuleiro.registrarObserver(evento -> {

			// Invocar depois.
			SwingUtilities.invokeLater(() -> {
				if (evento.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Voce ganhou!");
				} else {
					JOptionPane.showMessageDialog(this, "Voce perdeu!");
				}
				
				int resposta = JOptionPane.showConfirmDialog(this, "Deseja reiniciar o jogo?",
						"Fim de Jogo", JOptionPane.YES_NO_OPTION);
				if(resposta == JOptionPane.YES_OPTION) {
					tabuleiro.reiniciarJogo();					
				}
				else if(resposta == JOptionPane.NO_OPTION) {
					System.exit(0);
				}
			});
		});
	}
}
