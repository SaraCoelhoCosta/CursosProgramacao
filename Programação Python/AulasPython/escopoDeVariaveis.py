"""
Aula 3: Escopo de variáveis

1. Variáveis globais: é reconhecida no programa inteiro

2. Variáveis locais: é limitada apenas no local em que foi declarada.

Declaração:
nome_variavel = valor_variavel

O Python reconhece o tipo da variável a partir do valor que é atribuido.
"""

# Variável global
numero = 20
print(f'Numero: {numero}')

# É possível fazer reatribuição
numero = "Vinte"
print(f'Variável \'numero\': {numero}')

numero = 20
print(f'Variável \'numero\': {numero}')

if numero > 10:
    # Variável local
    novo = numero + 10
    print(f'Novo numero: {novo}')
