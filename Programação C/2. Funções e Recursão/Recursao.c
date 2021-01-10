/*
 * Recursividade é o ato de uma função chamar a si mesma.
 *
 * OBS: A função recursiva funciona como um laço de repetição, então é importante que a função recursiva tenha uma condição de parada.
 *
 * Ex: 5 primeiros números da sequência fibonacci -> 1 1 2 3 5
 *
 *
 */

#include <stdio.h>

//Protótipo da função
int fibonacci(int);

int main(){

	int quantidade;

	printf("Informe o tamanho da sequência fibonacci: ");
	scanf("%d", &quantidade);

	for(int i = 0; i < quantidade; i++){
        //Impressão e chamada da função.
		printf("%d ", fibonacci (i + 1));
	}

	return 0;
}

int fibonacci (int n){

    //Exceção.
	if(n == 0){
		return 0;
	}

    //Condição de parada.
	if(n == 1){
		return 1;
	}

    //Recursão.
	return fibonacci(n - 1) + fibonacci(n - 2);
}
