package br.com.cod3r.campoMinado.modelo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.campoMinado.excecao.ExplosaoException;

public class CampoTeste {

	private Campo campo;

	/*
	 * @BeforeEach - Chama a funcao para cada metodo que for testado, ou seja, os
	 * outros metodos testados nao serao afetados pelo valor do metodo anterior.
	 */
	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}

	// @Test - Indica que o metodo(codigo) esta sendo testado.
	// Testa se sao campos sao vizinhos ou nao.
	@Test
	void testeVizinhoDistanciaEsquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.getAdicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistanciaDireita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.getAdicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistanciaEmCima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.getAdicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistanciaEmBaixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.getAdicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeVizinhoDistanciaDiagonal() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.getAdicionarVizinho(vizinho);
		assertTrue(resultado);
	}

	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.getAdicionarVizinho(vizinho);
		assertFalse(resultado);
	}

	// Testa sinalizacao.
	@Test
	void testeValorPadraoAtributoSinalizacao() {
		assertFalse(campo.isSinalizado());
	}

	@Test
	void testeAlterarSinalizacao() {
		campo.alterarSinalizacao();
		assertTrue(campo.isSinalizado());
	}

	@Test
	void testeAlterarSinalizacaoDuasChamadas() {
		campo.alterarSinalizacao();
		campo.alterarSinalizacao();
		assertFalse(campo.isSinalizado());
	}

	@Test
	void testeCampoAbertoAlterarSinalizacao() {
		campo.getAbrir();
		campo.alterarSinalizacao();
		assertFalse(campo.isSinalizado());
	}

	// Testa metodo para abrir campo.
	@Test
	void testeAbrirNaoMinaSemSinalizacao() {
		assertTrue(campo.getAbrir());
	}

	@Test
	void testeAbrirNaoMinaComSinalizacao() {
		campo.alterarSinalizacao();
		assertFalse(campo.getAbrir());
	}

	@Test
	void testeAbrirMinaComSinalizacao() {
		campo.alterarSinalizacao();
		campo.minar();
		assertFalse(campo.getAbrir());
	}

	@Test
	void testeAbrirMinaSemSinalizacao() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.getAbrir();
		});
	}

	@Test
	void testeAbrirComCampoAberto() {
		campo.getAbrir();
		assertFalse(campo.getAbrir());
	}

	// Testa se vizinhos possuem mina ou nao e se os mesmo abrem seus campos.
	@Test
	void testeAbrirComVizinhosSemMina() {
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinhoDoVizinho1 = new Campo(1, 1);

		campo.getAdicionarVizinho(vizinho1);
		vizinho1.getAdicionarVizinho(vizinhoDoVizinho1);

		campo.getAbrir();
		assertTrue(vizinho1.isAberto() && vizinhoDoVizinho1.isAberto());
	}

	@Test
	void testeAbrirComVizinhosComMina1() {
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinhoDoVizinho1 = new Campo(1, 1);

		campo.getAdicionarVizinho(vizinho1);
		vizinho1.getAdicionarVizinho(vizinhoDoVizinho1);
		vizinho1.minar();

		campo.getAbrir();
		assertTrue(!vizinho1.isAberto() && !vizinhoDoVizinho1.isAberto());
	}

	@Test
	void testeAbrirComVizinhosComMina2() {
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinhoDoVizinho1 = new Campo(1, 1);

		campo.getAdicionarVizinho(vizinho1);
		vizinho1.getAdicionarVizinho(vizinhoDoVizinho1);
		vizinhoDoVizinho1.minar();

		campo.getAbrir();
		assertTrue(vizinho1.isAberto() && !vizinhoDoVizinho1.isAberto());
	}

	@Test
	void testeAbrirComVizinhosComMina3() {
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinhoDoVizinho1 = new Campo(1, 1);

		campo.getAdicionarVizinho(vizinho1);
		vizinho1.getAdicionarVizinho(vizinhoDoVizinho1);
		vizinho1.minar();
		vizinhoDoVizinho1.minar();

		campo.getAbrir();
		assertTrue(!vizinho1.isAberto() && !vizinhoDoVizinho1.isAberto());
	}

	// Testa reiniciar o jogo.
	@Test
	void testeReiniciar() {
		campo.reiniciarCampo();
		assertFalse(campo.isAberto());
		assertFalse(campo.isSinalizado());
		assertFalse(campo.isMinado());
	}

	// Testa toString.
	@Test
	void testeToStringFechado() {
		assertEquals("?", campo.toString());
	}

	@Test
	void testeToStringSinalizado() {
		campo.alterarSinalizacao();
		assertEquals("X", campo.toString());
	}

	@Test
	void testeToStringAbertoComMina() {
		campo.getAbrir();
		campo.minar();
		assertEquals("*", campo.toString());
	}

	@Test
	void testeToStringAbertoSemMina() {
		campo.getAbrir();
		assertEquals(" ", campo.toString());
	}

	@Test
	void testeToStringAbertoComMinaNaVizinhaca() {
		Campo vizinho1 = new Campo(3, 4);
		Campo vizinho2 = new Campo(3, 2);

		campo.getAdicionarVizinho(vizinho1);
		campo.getAdicionarVizinho(vizinho2);

		vizinho1.minar();
		vizinho2.minar();
		campo.getAbrir();

		assertEquals("2", campo.toString());
	}

	// Testa se objetivo esta sendo alcancado.
	@Test
	void testeObjetivoAlcancadoDesvendadoProtegidoVF() {
		campo.getAbrir();
		assertTrue(campo.getObjetivoAlcancadoNoCampo());
	}

	@Test
	void testeObjetivoAlcancadoDesvendadoProtegidoFV() {
		campo.alterarSinalizacao();
		campo.minar();
		assertTrue(campo.getObjetivoAlcancadoNoCampo());
	}

	@Test
	void testeObjetivoAlcancadoDesvendadoProtegidoFF1() {
		campo.getAbrir();
		campo.minar();
		assertFalse(campo.getObjetivoAlcancadoNoCampo());
	}

	@Test
	void testeObjetivoAlcancadoDesvendadoProtegidoFF2() {
		campo.alterarSinalizacao();
		assertFalse(campo.getObjetivoAlcancadoNoCampo());
	}

	// Testa linha e coluna.
	@Test
	void testeLinha() {
		campo.getLinha();
	}
	
	@Test
	void testeColuna() {
		campo.getColuna();
	}
	
}
