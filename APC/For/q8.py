# 'Faça um programa que recebe um conjunto de inteiros e um valor n e indique qual o valor mais próximo de n no conjunto'

numeros = [2,4,5,6,10,1,20,26]
n = -40

menor_distancia = abs(n - numeros[0])
mais_proximo = numeros[0] 
for num in numeros:
    distancia = abs(n - num)
    if distancia < menor_distancia:
        menor_distancia = distancia
        mais_proximo = num
print(f'O valor mais próximo de {n} é {mais_proximo}')

menor_distancia = abs(n - numeros[0])
mais_proximo = 0
for num in numeros:
    distancia = abs(n - num)
    if distancia < menor_distancia:
        menor_distancia = distancia
        mais_proximo = num

print(f'A maior distância = ',distancia)
print(f'O valor mais próximo de {n} é {mais_proximo}')

