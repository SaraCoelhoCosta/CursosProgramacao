#include <stdio.h>

int main() {
	// 2 é igual a 0010 em binário.
    // 2 é igual a 0000 0010 (considerando sinal e magnitude, o primeiro número/bit é o sinal e os outros 7 são magnitude)
	int valor = 2;

	//Deslocando 2 bits para esquerda
	// 0010 => 1000 = 8 ("adiciona 0 a direita, podendo perder a posição inicial anterior")
	valor = valor << 2;
	printf("%d\n", valor);

   	//Deslocamento 1 bit para direita
    //0010 => 0001 = 1 ("adiciona 0 a esquerda, podendo perder a última posição")
    valor = 2
	valor = valor >> 1;
	printf("Valor vale %d\n", valor);

    //Negação
    //0000 0010 => 1111 1101 = -3 ("inverte cada digito, se for 1 vira 0 e vice-versa")
	valor = 2;
	valor = ~valor;
	printf("%d\n", valor);

}
