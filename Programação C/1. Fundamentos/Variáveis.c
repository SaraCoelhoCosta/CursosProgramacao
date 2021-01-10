/*
 * 	Aula sobre variáveis.
 *
 *  Created on: 14 de fev de 2019
 */

//Biblioteca para entrada e saída padrão.
#include <stdio.h>

int main() { //Início.

	//Declarando variável(int = inteiro).
	int idade;

	/*Declarando e inicializando variáveis
	 int idade = 0;*/

	//Função para escrever algo na saída padrão(console).
	printf("Digite sua idade: ");

	//Essa função 'limpa' a saída do console para que a mensagem apareça corretamente para o usuário.
	fflush(stdout);

	/*Função para receber dados na entrada padrão(teclado, etc).
	 * Especifica o tipo da variável(int = %d).
	 * Os parâmetros são separados por vírgulas
	 * (1° parâmetro define o tipo de dado e o 2° parâmetro a variável onde o dado vai ser guardado).
	 */
	scanf("%d", &idade);

	//Saída.
	printf("A sua idade é %d ano(s)\n", idade);

	return 0;
}
/*Fim.
 * As chaves delimitam um bloco de código.
 * Os ponto e vírgula finalizam um comando.
 */
