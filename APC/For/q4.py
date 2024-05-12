#Algoritmo que recebe um conjunto de inteiros e calceula a aplitude do conjunto

print('='*50)
numeros = [1,8,7,-5,5,10,8,7] 

maior = numeros[1]
for num in numeros:
    if num > maior:
        maior = num

menor = numeros[0]
for num in numeros:
    if num < menor:
        menor = num
        
amplitude = maior - menor
print('A amplitude do conjunto é:',amplitude)