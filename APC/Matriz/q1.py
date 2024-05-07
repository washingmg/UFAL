# 1. Implemente uma função que recebe uma matriz e verifica se ela é simétrica

#1° função para verificar a quantidade de linhas e colunas na matriz
def verificar_simetria(matriz):
    m = len(matriz) #linhas
    n = len(matriz[0]) #colunas

    if m != n:
        return False  # A matriz não pode ser simétrica se o número de linhas não for igual ao número de colunas
    
    #caso a condição seja verdaira, compararemos
    for i in range(m):
        for j in range(n):
            if matriz[i][j] != matriz[j][i]: #transposta
                return False
        return True

# Exemplo de uso:
A = [[1, 2, 3],
     [2, 4, 5],
     [3, 5, 6]]

B = [[1, 2],
     [2, 3]]

C = [[1, 2, 3],
     [2, 4, 5]]

print(verificar_simetria(A))  # Retorna True
print(verificar_simetria(B))  # Retorna True
print(verificar_simetria(C))  # Retorna False
