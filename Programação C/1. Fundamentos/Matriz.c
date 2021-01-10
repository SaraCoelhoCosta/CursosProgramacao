/* Aula sobre Matrizes - Array multi-dimensional (matrizes)
 *
 * Ex: int numeros[5][5];  -> numero[linhas][colunas];
 *
 * [00][01][02][03][04]
 * [10][11][12][13][14]
 * [20][21][22][23][24]
 * [30][31][32][33][34]
 * [40][41][42][43][44]
 *
 *  Created on: 27 de jun de 2019
 */

#include <stdio.h>

int main(){

	//Matriz com char é 1 Vetores de 2 ou + Strings.
	char nome[3][50];

    //Recebe nomes.
	for(int i = 0; i < 3; i++){
		printf("Qual seu nome? ");
		gets(nome[i]);
	}

    //Imprime matriz de nomes.
	for(int i = 0; i < 3; i++){
		printf("Olá %s\n", nome[i]);
	}

    //Matriz de números inteiros.
	int numeros[2][2];
	numeros[0][0] = 1;
	numeros[0][1] = 2;
	numeros[1][0] = 3;
	numeros[1][1] = 4;

    //Imprime matriz de inteiros.
	for(int i = 0; i < 2; i++){
		for(int j = 0; j < 2; j++){
			printf("numeros[%d][%d] vale %d\n", i, j, numeros[i][j]);
		}
	}

	//Matrizes de números reais: float valores[5][5];

	return 0;
}
