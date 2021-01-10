/*
 * Modelo mais correto de criar e usar uma função.
 *
 * Estrutura do protótipo de função: Assinatura das funções, tipo de retorno, nome,
 * parâmetros de entrada (opcional).
*/

#include <stdio.h>

//Protótipos de função
int soma(int, int);
void mensagem();

//Função principal (inicial).
int main(){
	int n1, n2, retorno;

	printf("Informe o primeiro número: ");
	scanf("%d", &n1);

	printf("Informe o segundo número: ");
	scanf("%d", &n2);

	retorno = soma(n1, n2);

	printf("A soma de %d com %d é %d", n1, n2, retorno);

	mensagem();

	return 0;
}


//Funções.
int soma(int num1, int num2){
	return num1 + num2;
}

void mensagem(){
	printf("Bem-vindo...");
}
