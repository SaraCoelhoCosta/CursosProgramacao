/*
 *	A busca binária é feita a partir de um vetor ordenado.
 *
 *  Created on: 26 de dez. de 2020
 */

#include <stdio.h>

int buscaBinaria(int[], int, int);

int main() {
	//Vetor ordenado.
	int v[6] = { 1, 3, 5, 8, 12, 42 };

	//Valor que será procurado.
	int chave = 12;

	//Realizando busca.
	int retorno = buscaBinaria(v, chave, 6);

	if (retorno != -1) {
		printf("O elemento %d está na posição %d\n", chave, retorno);
	} else {
		printf("Elemento não encontrado!\n");
	}
	return 0;
}

int buscaBinaria(int v[], int chave, int tam) {
	int inicio = 0, final = tam - 1, meio;

	while (inicio <= final) {
		//Encontra o meio do vetor.
		meio = (inicio + final) / 2;

		//Se a chave estiver no meio, retorna a posição.
		if (chave == v[meio]) {
			return meio;
		}

		//Se a chave for menor que o valor do meio passa para o próximo elemento.
		if (chave < v[meio]) {
			final = meio - 1;
		} else {
			inicio = meio + 1;
		}
	}
	//Se não encontrar nada...
	return -1;
}
