"""
Aula 4: Estrutura condicional (if, else, elif)
"""

idade = int(input('Qual sua idade? '))

if idade < 18:
    # Bloco de código
    print(f'Menor de idade!\n')
elif idade == 18:
    # Novo bloco de código 1
    print(f'Tem 18 anos!\n')
else:
    # Novo bloco de código 2
    print(f'Maior de idade!\n')
