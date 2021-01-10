"""
Aula 6: Estruturas de repetição - parte 1 (for, while, range)

                For:
for x in vetor:
    instrução
"""

# Iteração com string
texto = "Bom dia!"
# (texto * X) onde X é um valor inteiro, ele repete o valor que está em 'texto' X vezes.
print(f'String: ')
for letra in texto:
    print(f'{letra}', end="")  # end="" -> para não pular linha

# Iteração com string (usando enumerate)
print(f'\n\n1. String com enumerate')
# Quando não utiliza uma das variáveis substituisse por underline (_). EX: for _, letra in enumerate(texto):
for indice, letra in enumerate(texto):
    print(f'{indice} = {letra}')  # print(f'{texto[indice]}') ou print(letra)

print(f'\n2. String com enumerate')
for valor in enumerate(texto):
    print(valor)

# Iteração com lista
lista = [1, 3, 5, 7, 9]
print(f'\nLista: ', end="")
for i in lista:
    print(f'{i} ', end=" ")

# Iteração com range
# OBS: range(valorInicial, valorFinal), o valor final não está incluido na impressão.
print(f'\nRange: ', end="")
for numero in range(1, 10):
    print(f'{numero} ', end=" ")

print(f'\nRange: com continue\n', end="")
for numero in range(1, 10):
    if numero % 2 == 1:
        continue  # Salto (pula um número quando atende condição)
    print(f'{numero} ', end=" ")  # Senão

print(f'\nRange: com break\n', end="")
for numero in range(1, 10):
    if numero > 5:
        break  # Parada (sai do loop)
    print(f'{numero} ', end=" ")

# Recebendo quantidade do usuário
quantidade = int(input("\n\nQual a quantidade de loops? "))
for n in range(1, quantidade + 1):
    print(f'Imprimindo: {n}')

# Percorrendo um dicionário

# Dicionário produto
produto = {
    'nome': 'Caneta',
    'preco': 8.80,
    'desconto': 0.15
}
print(f'\nPercorrendo dicionário produto')
for atributo in produto:
    print(atributo, ' = ', produto[atributo])
