# 2. Implemente uma função que recebe uma matriz e um inteiro e faz a multiplicação da matriz pelo inteiro

def multiplicar_matriz_por_inteiro(matriz, inteiro):
    m = len(matriz)  # Número de linhas
    n = len(matriz[0])  # Número de colunas
    
    for i in range(m):
        for j in range(n):
            matriz[i][j] *=inteiro
    
    return matriz

A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

inteiro = 2
resultado = multiplicar_matriz_por_inteiro(A, inteiro)

for linha in resultado:
    print(linha)
print()

b = [[1, 5, 3],
     [4, 5, 6],
     [7, 0, 9]]

inteiro = 4
resultado = multiplicar_matriz_por_inteiro(b, inteiro)

for linha in resultado:
    print(linha)
