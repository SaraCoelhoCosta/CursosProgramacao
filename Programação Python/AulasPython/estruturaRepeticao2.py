"""
Aula 6: Estruturas de repetição - parte 2 (for, while, range)

                        Range:
- Apresenta uma sequência númerica em ordem.
- range(valorInicial, valorFinal) ou range(valorFinal), o valor final não está incluido na impressão.
- range(valorFinal), inicia do 0 e incrementa de 1 em 1.
- range(valorInicial, valorFinal, incremento)
- range(valorFinal, valorinicial, decremento)
"""

print(f'Range 1 - Forma geral (inicio em 0)\n')
for num in range(11):
    print(num)

print(f'\nRange 2 - inicio em 1 e parada em 10\n')
for num in range(1, 11):
    print(num)

print(f'\nRange 3 - incrementando de 2 em 2\n')
for num in range(0, 11, 2):
    print(num)

print(f'\nRange 4 - decrementando\n')
for num in range(10, 0, -1):
    print(num)
