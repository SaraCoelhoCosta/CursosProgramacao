/*
 *
 *  Created on: 26 de dez. de 2020
 */

#include <stdio.h>

int buscaLinear(int[], int, int);

int main() {
	//Vetor ordenado.
	int v[6] = { 1, 3, 5, 8, 12, 42 };

	//Elemento a ser procurado.
	int chave = 12;

	//Realizando a busca.
	int retorno = buscaLinear(v, chave, 6);

	if (retorno != -1) {
		printf("O elemento %d está na posição %d\n", chave, retorno);
	} else {
		printf("Elemento não encontrado!\n");
	}

	return 0;
}

int buscaLinear(int v[], int chave, int tam) {

	for (int i = 0; i < tam; i++) {
		if (v[i] == chave) {
			return i;
		}
	}
	return -1;
}
