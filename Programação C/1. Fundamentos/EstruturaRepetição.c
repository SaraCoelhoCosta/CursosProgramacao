/*
 *	Estruturas de repetição (for, while, do... while)
 *							   (para, enquanto, faça... enquanto)
 *
 *  Utilizando o For (para): Faça um programa, no qual receba e some 5 números inteiros e apresente a soma no final.
 *
 *  Created on: 18 de mai de 2019
 */

#include <stdio.h>
int main() {
	//Variáveis
	int numero, soma = 0;

	//Para o int i iniciando em 0; enquanto i < 5; incrementa o i em 1
	//Inicialização, critério de parada, forma de incremento
	for (int i = 0; i < 5; i++) {

		//Entrada: recebe um valor.
		printf("Informe um número: ");
		scanf("%d", &numero);

		//Processamento: acumula a soma.
		soma = soma + numero;
	}

	//Saída: exibe o valor.
	printf("A soma é %d", soma);

	return 0;

}
