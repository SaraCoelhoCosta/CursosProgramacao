"""
Aula 6: Estruturas de repetição - parte 3(for, while, range)

                While
while expressão_Booleana:
    instrucão

- Expressão Booleana: pode ter valor verdadeiro ou falso.
- Enquanto a expressão booleana for verdadeira, realiza o loop.
"""

numero = 0
print(f'Sequência de 0 a 9')
while numero < 10:
    print(numero)
    numero = numero + 1  # incremento. Critério de parada para não virar um loop infinito.

resposta = ' '
print(f'\nResponda \'sim\' para sair')
while resposta != 'sim':
    resposta = input("Acabou Jéssica? ")

