package br.com.cod3r.campoMinado.modelo;

@FunctionalInterface
public interface CampoObserver {

	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
