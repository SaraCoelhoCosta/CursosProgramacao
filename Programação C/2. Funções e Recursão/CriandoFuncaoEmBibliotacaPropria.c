/*
 * Criando função a partir de uma biblioteca própria -> ajuda.h.
 */

#include <stdio.h>
//A declaração da biblioteca também pode ser entre "".
#include "ajuda.h"

int main(){
	int n1, n2, retornoS, retornoM;

	mensagem();

	printf("Informe o primeiro número: ");
	scanf("%d", &n1);

	printf("Informe o segundo número: ");
	scanf("%d", &n2);

	retornoS = soma(n1, n2);
	printf("A soma de %d com %d é %d\n", n1, n2, retornoS);

	retornoM = multiplicacao(n1, n2);
	printf("A multiplicação de %d com %d é %d\n", n1, n2, retornoM);

	return 0;
}
