package br.com.cod3r.campoMinado.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import br.com.cod3r.campoMinado.modelo.Campo;
import br.com.cod3r.campoMinado.modelo.CampoEvento;
import br.com.cod3r.campoMinado.modelo.CampoObserver;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObserver, MouseListener {

	private Campo campo;
	private final Color BG_PADRAO = new Color(215, 215, 215);
	private final Color BG_MARCAR = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(255, 0, 0);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);

	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBackground(BG_PADRAO); // Define cor.
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0)); // Define bordas no botao.

		addMouseListener(this);
		campo.registrarObserver(this);
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch (evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
			break;
		}

		// Forca a reiniiciar.
		SwingUtilities.invokeLater(() -> {
			repaint();
			validate();
		});
	}

	private void aplicarEstiloPadrao() {
		setBorder(BorderFactory.createBevelBorder(0));
		setBackground(BG_PADRAO);
		setText("");
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.BLACK);
		setText("#");
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCAR);
		setForeground(Color.BLACK);
		setText("X");
	}

	private void aplicarEstiloAbrir() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createLineBorder(Color.GRAY));

		if (campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			return;
		}

		switch (campo.getCalculaMinaNaVizinhaca()) {
		case 1:
			setForeground(TEXTO_VERDE);
			break;
		case 2:
			setForeground(Color.BLUE);
			break;
		case 3:
			setForeground(Color.YELLOW);
			break;
		case 4:
		case 5:
		case 6:
			setForeground(Color.RED);
			break;
		default:
			setForeground(Color.ORANGE);
			break;
		}
		String textoBotao = !campo.getVerificaSeVizinhacaEstaSegura() ? campo.getCalculaMinaNaVizinhaca() + "" : "";
		setText(textoBotao);
	}

	// Interfaces dos eventos do Mouse.
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == 1) {
			campo.getAbrir();
		} else {
			campo.alterarMarcacao();
		}
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}
}
