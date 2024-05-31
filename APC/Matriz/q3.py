# 4. Um quadrado mágico é aquele dividido em linhas e colunas no qual a soma das linhas, das colunas e diagonais é a mesma. Ex:
# 8  3  4
# 1  5  9
# 6  7  2
# Implemente uma função que recebe uma matriz e verifica se é um quadrado mágico


def verificar_quadrado_magico(matriz):
    n = len(matriz)
    
    # Verificar a soma das linhas
    soma_linhas = sum(matriz[0])
    for i in range(1, n):
        if sum(matriz[i]) != soma_linhas:
            return False

    # Verificar a soma das colunas
    for j in range(n):
        soma_coluna = sum(matriz[i][j] for i in range(n))
        if soma_coluna != soma_linhas:
            return False
    
    # Verificar a soma da diagonal principal
    soma_diag_principal = sum(matriz[i][i] for i in range(n))
    if soma_diag_principal != soma_linhas:
        return False

    # Verificar a soma da diagonal secundária
    soma_diag_secundaria = sum(matriz[i][n - i - 1] for i in range(n))
    if soma_diag_secundaria != soma_linhas:
        return False

    return True

# Exemplo de uso:
matriz_magica = [[8, 3, 4],
                 [1, 5, 9],
                 [6, 7, 2]]

matriz_nao_magica = [[2, 7, 6],
                     [9, 5, 1],
                     [4, 3, 7]]

print(verificar_quadrado_magico(matriz_magica))  # Retorna True
print(verificar_quadrado_magico(matriz_nao_magica))  # Retorna False
