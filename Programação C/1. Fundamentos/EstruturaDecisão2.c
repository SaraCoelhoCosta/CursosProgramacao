/*
 * 	Aula sobre estrutura de decisão do switch.
 *
 *  Created on: 20 de mar de 2019
 */

#include<stdio.h>

int main() {

	//Declaração.
	int dia;

	//Entrada.
	printf("Escolha um valor de 1 a 7: ");
	scanf("%d", &dia);

	//Processamento, ocorre a partir do caso escolhido, representado pelo 'dia'.
	switch (dia) {
	case 1:
		printf("Domingo\n");
		break;
	case 2:
		printf("Segunda-feira\n");
		break;
	case 3:
		printf("Terça-feira\n");
		break;
	case 4:
		printf("Quarta-feira\n");
		break;
	case 5:
		printf("Quinta-feira\n");
		break;
	case 6:
		printf("Sexta-feira\n");
		break;
	case 7:
		printf("Sábado\n");
		break;
	default:
		printf("Não existe dia correspondente\n");
	}

	return 0;
}
