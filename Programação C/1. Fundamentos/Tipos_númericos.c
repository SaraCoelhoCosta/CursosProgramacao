/* Aula sobre tipo de dados.
 *
 * Tipos Númericos:
 * 	- Inteiros
 * 	- Reais
 *
 *  Created on: 21 de jun de 2019
 */

#include <stdio.h>

int main() {

	//Inteiro:
	//int nota1, nota2; // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9...

	//Real:
	float media, nota1, nota2; // 3.14, 1.5, ...
	//double outra_media; //Suporta uma quantidade de caracter maior que o FLOAT

	printf("Qual a primeira nota? ");
	scanf("%f", &nota1);
	printf("Qual a segunda nota? ");
	scanf("%f", &nota2);

	media = (nota1 + nota2) / 2;
	printf("Sua média é de: %.2f", media);

	return 0;
}
