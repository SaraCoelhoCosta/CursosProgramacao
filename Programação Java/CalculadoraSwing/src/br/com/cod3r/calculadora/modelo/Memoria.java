package br.com.cod3r.calculadora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

	private enum TipoComando {
		ZERAR, NUMERO, ALTERAR_SINAL, DIVISAO, MULTIPLICACAO, SUBTRACAO, SOMA, IGUAL, VIRGULA;
	};

	private static final Memoria instancia = new Memoria();
	private final List<MemoriaObservador> observadores = new ArrayList<>();
	private String textoAtual = "";
	private String textoBuffer = "";
	private boolean substituir = false;
	private TipoComando ultimaOperacao = null;

	private Memoria() {

	}

	public static Memoria getInstancia() {
		return instancia;
	}

	// Texto exibido no display.
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "" : textoAtual;
	}

	// Registra quem receberam aviso do acontecimento do evento.
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}

	public void processarComando(String texto) {

		TipoComando tipoComando = detectarTipoComando(texto);

		if (tipoComando == null) {
			return;
		} else if (tipoComando == TipoComando.ZERAR) {
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
		} else if (tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? texto : textoAtual + texto;
			substituir = false;
		} else if (tipoComando == TipoComando.ALTERAR_SINAL && !textoAtual.contains("-")) {
			textoAtual = "-" + textoAtual;

		} else if (tipoComando == TipoComando.ALTERAR_SINAL && textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);

		} else {
			substituir = true;
			textoAtual = obterResultadoOperacao();
			ultimaOperacao = tipoComando;
			textoBuffer = textoAtual;
		}

		observadores.forEach(o -> o.alterarValor(getTextoAtual()));
	}

	private TipoComando detectarTipoComando(String texto) {

		if (textoAtual.isEmpty() && texto == "0") {
			return null;
		}

		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {

			// Quando nao for numero...
			if ("AC".equals(texto) && !textoAtual.isEmpty()) {
				return TipoComando.ZERAR;
			} else if ("/".equals(texto) && !textoAtual.isEmpty()) {
				return TipoComando.DIVISAO;
			} else if ("*".equals(texto) && !textoAtual.isEmpty()) {
				return TipoComando.MULTIPLICACAO;
			} else if ("-".equals(texto) && !textoAtual.isEmpty()) {
				return TipoComando.SUBTRACAO;
			} else if ("+".equals(texto) && !textoAtual.isEmpty()) {
				return TipoComando.SOMA;
			} else if ("=".equals(texto) && !textoAtual.isEmpty()) {
				return TipoComando.IGUAL;
			} else if ("+/-".equals(texto) && !textoAtual.isEmpty()) {
				return TipoComando.ALTERAR_SINAL;
			} else if (",".equals(texto) && !textoAtual.contains(",")) {
				return TipoComando.VIRGULA;
			}
		}
		return null;
	}

	private String obterResultadoOperacao() {
		if (ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}

		double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
		double resultado = 0;

		if (ultimaOperacao == TipoComando.SOMA) {
			resultado = numeroBuffer + numeroAtual;

		} else if (ultimaOperacao == TipoComando.SUBTRACAO) {
			resultado = numeroBuffer - numeroAtual;

		} else if (ultimaOperacao == TipoComando.MULTIPLICACAO) {
			resultado = numeroBuffer * numeroAtual;

		} else if (ultimaOperacao == TipoComando.DIVISAO) {
			if (numeroAtual == 0) {
				resultado = 0;
			} else {
				resultado = numeroBuffer / numeroAtual;
			}
		}

		String resultadoString = Double.toString(resultado).replace(".", ",");
		boolean inteiro = resultadoString.endsWith(",0");
		return inteiro ? resultadoString.replace(",0", "") : resultadoString;
	}
}
