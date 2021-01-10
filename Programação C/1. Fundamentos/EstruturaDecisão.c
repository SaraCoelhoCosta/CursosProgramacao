/*
 * 	Aula sobre estrutura de decisão (If, else, else if).
 *                                 (se, então, então se).
 *
 *  Created on: 18 de mar de 2019
 */

#include <stdio.h>

int main() {

	//Declaração de variável.
	int idade;

	//Entrada: recebe dado do usuário.
	printf("Qual é a sua idade? ");
	scanf("%d", &idade);

	//Processamento: verifica em qual condição se encaixa e exibe uma resposta.
	if (idade < 18) {
		printf("Você é menor de idade\n");
	}

	else if (idade >= 18 && idade < 60) {
		printf("Você é adulto.\n");
	}

	else {
		printf("Você é idoso.\n");
	}

	//Saída: exibe um resultado.
	printf("Sua idade é: %d.", idade);

	return 0;
}
