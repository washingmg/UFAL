#somar duas matrizes
def somar(A, B):
    m = len(A)
    n = len(A[0])
    
    # Criar uma matriz de zeros, ja que iremos somar os resultados
    C = [[0 for i in range(n)] for i in range(m) ]
    
    for i in range(m):
        for j in range(n):
            C[i][j] = A[i][j] + B[i][j]
    return C

A = [[2, 3, 1], [4, 0, 1]]
B = [[1, 5, 2], [0, 1, 1]]

C = somar(A, B)
print(C)
