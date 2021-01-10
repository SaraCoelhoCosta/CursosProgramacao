/*
 *	Diferente do Select Sort que altera a posição após verificar todo o vetor. O Insert Sort altera as posições do vetor toda
 *	vez que encontrar um valor menor do que o que está sendo comparado.
 *
 *  Created on: 25 de dez. de 2020
 */

#include <stdio.h>

void insertSort(int[], int);

int main() {
   int v[6] = {8, 3, 1, 42, -1, 5};

   //Aplicando a ordenação.
   insertSort(v, 6);

   //Imprimindo o vetor ordenado.
   printf("Vetor ordenado: ");
   for(int i = 0; i < 6; i++){
	   printf("%d ", v[i]);
   }

   return 0;
}

void insertSort(int v[], int tam){
  int troca, proximo;

  //Percorre todo o vetor.
  for(int i = 1; i < tam; i++){
	  proximo = i;

    //Responsável pelas trocas.
    while((proximo != 0) && (v[proximo] < v[proximo - 1])){
      troca = v[proximo];
      v[proximo] = v[proximo - 1];
      v[proximo - 1] = troca;
      proximo--;
    }
  }
}
