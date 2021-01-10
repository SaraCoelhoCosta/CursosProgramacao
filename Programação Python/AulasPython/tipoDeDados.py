"""
Aula 2: Tipo de dados

type(num) -> Retorna o tipo de dado
"""

"""
TIPO NUMÉRICO

Operações básicas dos tipos numéricos:
5 + 2 = 7 -> Soma
5 - 2 = 3 -> Subtração
5 * 2 = 10 -> Multiplicação
5 / 2 = 2.5 -> Divisão com resultado real
5 // 2 = 2 ou int(5/2) -> Divisão com resultado inteiro
5 % 2 = 1 -> Módulo
5 ** 2 = 25 -> Exponencial

num += 1 -> num = num + 1
num -= 1 -> num = num - 1
num *= 1 -> num = num * 1
num /= 1 -> num = num / 1
num //= 1 -> num = num // 1
num %= 1 -> num = num % 1

Float -> Número decimal ou real.
OBS: casas decimais são separados por . e não ,

(num++) ou (num--) -> não existe, pois em Python não tem operador de incremento ou decremento
(-num) ou (--num) -> altera o sinal
"""
# Tipos numéricos

# 10_000_000 = 10000000
print(f'\nINTEIRO')
num = 10_000_000
print(f'{num}\n')

# Float errado, ele entende como uma tupla, os números são inteiros
print(f'\nFLOAT')
valor = 1, 44
print(f'valor = 1, 44 é uma tupla: {valor}')

# É possível fazer tupla atribuição
valor1, valor2 = 4, 22
print(f'valor1, valor2 = 4, 22')
print(f'Valor 1: {valor1}')
print(f'Valor 2: {valor2}')

# Float certo
valor = 1.44
print(f'valor = 1.44 é um Float: {valor}\n')

# Número complexo
num = 5j
# Imprime o tipo de dado de 'num'
print(f'num = 5j é do tipo: ', type(num))

"""
BOOLEANO

O booleano possui apenas dois valores. E suas iniciais devem ser com letra maiúscula:

True -> Verdadeiro
False -> Falso

Operações básicas:
not (negação) -> se o valor for verdadeiro o resultado é falso e vice-versa:
            not True = False
            not False = True

or (ou) -> operação binária, isto é, depende de dois valores e para ser verdadeiro pelo menos um dos valores deve ser
verdadeiro:
            True or True -> True
            True or False -> True
            False or True -> True
            False or False -> False

and (e) -> operação binária, isto é, depende de dois valores e para ser verdadeiro pelo os valores devem ser
verdadeiros:
            True or True -> True
            True or False -> False
            False or True -> False
            False or False -> False
"""
print(f'\n\nBOOLEANO')

ativo = True
logado = False
print(f'Ativo: {ativo}')
print(f'logado: {logado}\n')
print(f'Negação Ativo: {not ativo}')
print(f'Logado ou Ativo: {logado or ativo}')
print(f'Logado ou Ativo: {logado and ativo}')


"""
STRING

Em Python, String é tudo que estiver entre:
- Aspas duplas;
- Aspas simples;
- Aspas duplas triplas;
- Aspas simples triplas;
"""
print(f'\n\nSTRING')

nome = "Olá mundo"
nome1 = 'João'
nome2 = """Lara"""
nome3 = '''Sara'''
print(f'Exemplos com nomes:\n{nome}\n{nome1}\n{nome2}\n{nome3}')

print(f'\nNome com letras maiúscula: {nome.upper()}')
print(f'Nome com letras minúscula: {nome.lower()}')

# ['Olá', 'mundo']
print(f'Imprime nome em forma de lista: {nome.split()}')

# [0, 1, 2, 3, 4, 5, 6, 7, 8]
# [O, l, á,  ,m, u, n, d, o]
print(f'Imprime as 4 primeiras posições (slice de string): {nome[0:3]}')
print(f'Imprime as 4 últimas posições (slice de string): {nome[5:9]}')
print(f'Imprime a palavra invertida (slice de string): {nome[::-1]}')

# ['Olá', 'mundo'] -> 'mundo'
print(f'Imprime a posição 1 da lista de nomes: {nome.split()[1]}')

print(f'Troca letras: ', nome.replace('l', 'i'))
