'Algoritmo que recebe dois conjuntos de inteiros A e B de tamanho n e calcula a distância euclidiana entre esses conjuntos.'
#Distância (A,B) = raiz² de (a[1] - b[1]² + (A[2] - b[2]²) + (A[n] - B[n]²)

num = int(input('Digite a quantidade de N° que serão adicionados na lista:  '))

A = [3,4,5,6]
B = [7,8,9,10]

for i in range(num):
    A.append(int(input('N° lsta A:  ')))
    B.append(int(input('N° lsta B:  ')))
print(A,B)

calc = 0
for indice, valor in enumerate(A):
    calc += (valor - B[indice]) **2
    distancia = calc ** (1/2)

print(f'A distancia euclidiana da lista é: {distancia}')

print('='*50)


A = [3,4,5,6]
B = [7,8,9,10]
calcular = 0
for indice, valor in enumerate(B):
    calcular += (valor - A[indice]) **2
    distancia = calcular ** (1/2)
print(f'A distancia euclidiana é {distancia}')
