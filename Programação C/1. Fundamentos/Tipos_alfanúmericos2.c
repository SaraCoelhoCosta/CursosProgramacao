/* Aula sobre tipo de dados.
 *
 * Tipos Alfanúmericos:
 * 	- Char
 * 	- String*
 * 	Na linguagem C não existe o tipo de dado String.
 * 	"String fica entre aspas dupla" e caracter fica entre aspas simples 'c'.
 *
 *  Created on: 21 de jun de 2019
 */

#include<stdio.h>

int main() {

	char opcao;

	printf("Informe uma opção:\n");
	printf("a) Saldo da conta\n"
	 	   "b) Extrato da conta\n"
		   "c) Limite da conta\n");
	scanf("%c", &opcao);

	if(opcao == 'a'){
		printf("Seu saldo é...\n");
	}

	else if(opcao == 'b'){
		printf("Extrato da conta...\n");
	}

	else if(opcao == 'c'){
		printf("Seu limite é...\n");
	}
	else{
		printf("Opção desconhecida.\n");
	}

	//Gerando alfabeto completo com um loop. Utilizando a tabela ASCII
	for (int i = 97; i <= 122; i++){
		printf("%c\n", i);
	}
	return 0;
}
