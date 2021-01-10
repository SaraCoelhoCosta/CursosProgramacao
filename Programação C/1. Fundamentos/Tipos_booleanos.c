/* Aula sobre tipo de dados.
 *
 * Tipos Booleanos:
 * 	- Falso(false)
 * 	- Verdadeiro(true)
 * Na linguagem C não existe um tipo de dado boolean. Mas a linguagem C, reconhece o valor 0 como falso(false)
 * e qualquer valor diferente de 0 verdadeiro(true).
 *
 *
 *  Created on: 21 de jun de 2019
 */
#include<stdio.h>

int main(){

    int booleano = 1;
    if(booleano){
      printf("Verdadeiro(True)\n");
    }
    else{
      printf("Falso(False)\n");
    }

  return 0;
}
