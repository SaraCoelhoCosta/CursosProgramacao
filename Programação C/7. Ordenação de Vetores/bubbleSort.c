/*
 *	Algoritmo de troca ou bolha, pode ser mais lento na pior das condições. Ele pega uma posição e verifica com a próxima,
 *	depois caso a primeira posição for maior que a segunda ele inverte a posição, contudo isso não garante a ordenação
 *	então ele é obrigado a voltar para o início do vetor até que ele esteja totalmente ordenado, sempre realizando o mesmo
 *	procedimento.
 *
 *  Created on: 25 de dez. de 2020
 */

#include <stdio.h>

void bubbleSort(int[], int);

int main() {

	int v[6] = { 8, 3, 1, 42, 12, 5 };

	//Aplicando a ordenação.
	bubbleSort(v, 6);

	//Apresentando o vetor ordenado.
	printf("Vetor ordenado: ");
	for (int i = 0; i < 6; i++) {
		printf("%d ", v[i]);
	}
    return 0;
}

void bubbleSort(int v[], int tam) {
	//Variável auxiliar.
	int proximo = 0;

	//Percorre todo o vetor (externo).
	for (int i = 0; i < tam; i++) {

		//Verificar os elementos.
		for (int j = 0; j < (tam - 1); j++) {

			//Ocorre a troca, caso o primeiro elemento seja maior que o segundo.
			if (v[j] > v[j + 1]) {
				proximo = v[j];
				v[j] = v[j + 1];
				v[j + 1] = proximo;
			}
		}
	}
}
