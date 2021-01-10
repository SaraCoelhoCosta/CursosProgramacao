""""
Aula 1: Como receber dados do usuário

OBS: Todos os dados recebido via input() são uma string.
"""

# Entrada de dados

"""
print("Qual seu nome? ")
nome = input()
"""
nome = input("Qual seu nome? ")

"""
print("Qual sua idade? ")
idade = input()

Ou

# Com cast
idade = int(input("Qual sua idade? "))
"""
idade = input("Qual sua idade? ")

# Saída
""" 
# Exemplo de print antigo, versão 2.x
print('Seja bem-vindo(a) %s' % nome)
print('A %s tem %s' % (nome, idade))

# Exemplo de print moderno, versão 3.x
print('Seja bem-vindo(a) {0}'.format(nome))
print('A {0} tem {1}'.format(nome, idade))
"""

# Exemplo de print mais atual, versão > 3.7
print(f'Seja bem-vindo {nome}')
print(f'A {nome} tem {idade} anos')

# int(idade) -> cast é a conversão de um tipo de dado a outro.
print(f'A {nome} nasceu em {2020 - int(idade)}')
