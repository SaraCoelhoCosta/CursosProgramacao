/*
 * Utilizando o Do.. While (faça.. enquanto): Faça um programa, no qual receba e soma números inteiros até que o
 * número de entrada seja 0 e apresente a soma no final.
 *
 *  Created on: 18 de mai de 2019
 */

#include <stdio.h>
int main() {

	int numero, soma = 0;

	/* Utilizado quando você precisa de um loop onde não se tenha um número fixo de elementos
	 mas que tenha um critério de parada e é checada após a primeira execução.*/

	do {
		printf("Informe um número: ");
		scanf("%d", &numero);

		soma = soma + numero;
	}

	while (numero != 0);

	printf("A soma é %d", soma);

	return 0;
}
