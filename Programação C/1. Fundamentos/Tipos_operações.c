/* Aula sobre tipo de dados.
 *
 * Operações Matemáticas:
 *  - Somar: +
 *  - Subtrair: -
 *  - Multiplicar: *
 *  - Dividir: /
 *  - Elevar ao quadrado x * x
 *  - Módulo(resto da divisão de x por y): %
 *
 *  Created on: 24 de jun de 2019
 */

#include<stdio.h>

int main(){

    int num1, num2;
    float res;

    printf("Digite num1: ");
    scanf("%d", &num1);
    printf("Digite num2: ");
    scanf("%d", &num2);

    //Somar
    res = num1 + num2;
    printf("Somar: %d\n", (int)res);
    //Subtrair
    res = num2 - num1;
    printf("Subtração: %d\n", (int)res);
    //Multiplicar
    res = num1 * num2;
    printf("Multiplicação: %d\n", (int)res);
    //Dividir
    //Cast - transforma o int em float, ou vice-versa
    res = (float)num1 / (float)num2;
    printf("Divisão: %.2f\n", res);
    //Elevar por 2
    res = num1 * num1;
    printf("O quadrado de num1: %d\n", (int)res);
    //Módulo: verificando se num1 é par ou ímpar
    if(num1 % 2 == 0){
        printf("%d é par\n", num1);
    }
    else{
        printf("%d é ímpar\n", num1);
    }
  return 0;
}
