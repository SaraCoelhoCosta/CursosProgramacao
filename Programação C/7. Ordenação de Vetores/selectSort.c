/*
 * Busca do menor numero: Pega um valor de uma posicao (i), e verifica com o resto ate encontrar o menor,
 * depois troca a posicao encontrada (j) com a posicao inicial (i).
 *
 *  Created on: 25 de dez. de 2020
 */

#include <stdio.h>

void selectSort(int[], int);

int main() {

	//Vetor desordenado.
	int v[6] = { 8, 3, 1, 42, 12, 5 };

	//Ordenacao do vetor.
	selectSort(v, 6);

	printf("Vetor ordenado: ");
	//Imprime vetor ordenado.
	for (int i = 0; i < 6; i++) {
		printf("%d ", v[i]);
	}
	return 0;
}

void selectSort(int v[], int tam) {
	int menor, troca;

	//Seleciona a posicao que sera comparada.
	for (int i = 0; i < tam - 1; i++) {
		menor = i;
		//Percorre o restante do vetor, a partir do segundo elemento.
		for(int j = i + 1; j < tam; j++){

			//Compara para ver quem e o menor.
			if(v[menor] > v[j]){
				menor = j;
			}
		}

		//Realiza troca caso encontre um valor menor que a posicao i.
		if(menor != i){
			troca = v[i];
			v[i] = v[menor];
			v[menor] = troca;
		}
	}

}
