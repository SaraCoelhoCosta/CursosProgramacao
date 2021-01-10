/* Aula sobre tipo de dados.
 *
 * Tipos Alfanúmericos:
 * 	- Char
 * 	- String*
 *
 *  Created on: 21 de jun de 2019
 */

#include<stdio.h>

int main() {

	char text[50]; //Cabem apenas 49 caracteres, o número 50 é para finalizar a String

	//Declaração de uma String em C
	printf("Qual é seu nome?\n");
	//Para pegar uma String usa-se 'gets' - forma mais comum
	fgets(text, 50, stdin);
	//Para apresentar o texto utiliza '%s'
	printf("Seu nome é %s\n", text);

	return 0;
}
