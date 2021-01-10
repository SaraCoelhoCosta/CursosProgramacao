/* Estrutura das funções: tipo de retorno, nome, parâmetros de entrada (opcional),
 * implementação (corpo da função), retorno (opcional).
 */

#include <stdio.h>

//Funções sem protótipo.

//Sem retorno (void) e sem parâmetros.
void mensagem(){
	printf("Bem-vindo!");
}

//Com retorno (tipo int) e dois parâmetros (num1, num2).
int soma(int num1, int num2){
	int resultado = num1 + num2;
	return resultado;
}

//Sem retorno (void) e com um parâmetro (caractere). 'a' = 97.
void proximo_char(char caractere){
	printf("%c", caractere + 1);
}


//Função principal (que dá início ao programa).
int main(){

	printf("Olá...\n");

    //Chama a função.
	mensagem();

	/* int retorno = soma(4, 6);
     * printf("Retorno = %d", retorno);
     * é igual a:
     */
	printf("Retorno = %d\n", soma(4, 6));

	char caracter = 97;
	proximo_char(caracter);

	return 0;
}
