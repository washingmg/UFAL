#numeros menor que a média

numeros = [1,3,7,8,5,4,10]
soma = 0
for num in numeros:
    soma += num
    media = soma / len(numeros)
print(f'Soma: {soma}')
print(f'média: {media:.2f}')
for num in numeros:
    if num < media:
        print(f'Números < média: {num}')
    