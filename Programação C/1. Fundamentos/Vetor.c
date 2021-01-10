/* Aula sobre Vetores - Array unidimensional
 *
 *  Created on: 27 de jun de 2019
 */

#include <stdio.h>

int main(){

    //Vetores e strings.
    char nome[50];
    printf("Qual seu nome? ");
    gets(nome);
    printf("Olá %s\n\n", nome);

    printf("Vetores com letras:\n");
    int cont = 0;
    //Vetores e caracteres.
    char letras[26];

    for(int i = 97; i <= 122; i++){
      letras[cont] = i;
      cont++;
    }

    //Imprimindo as letras e seus valores em decimal.
    for(int i = 0; i < 26; i++){
      printf("%d == %c\n", letras[i], letras[i]);
    }

    //char letra = 'l';
    //char a = 97;

    printf("\nVetores com número:\n");
    //Vetores de inteiros.
    int numeros[5]; //0 a 4.
    numeros[0] = 1;
    numeros[1] = 3;
    numeros[2] = 5;
    numeros[3] = 7;
    numeros[4] = 9;

    //Vetores e reais.
    float valores[5]; //0 a 4.
    for(int i = 0; i < 5; i++){
      valores[i] = (float)numeros[i] / (float)2;
    }

    //Imprime vetor de números reais.
    for(int i = 4; i >= 0; i--){
      printf("%.2f\n", valores[i]);
    }

  return 0;
}
