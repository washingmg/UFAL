m = 4
n = 3
A = [[0 for i in range(n)] for i in range(m) ]

# print(A)

A[2][1] = 5 #linha 3 na coluna 2 recebe 5
A[3][0] = 5 #linha 4 na coluna 1 recebe 5
A[1][2] = 5 #linha 1 na coluna 3 recebe 5

print(A)

def imprimir(A):
    for i in range(m):
        for j in range(n):
            (A[i][j])

for linha in A:
    print(linha)

# m = 4
# n = 3
# A = [[0 for i in range(n)] for i in range(m) ]

# for i in range(m):
#     A[i] = [0] * n
    
# print(A)