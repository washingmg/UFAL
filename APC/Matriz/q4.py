# 3. Implemente uma função que recebe uma matriz e um inteiro e verifica se o inteiro existe na matriz
def verificar_inteiro_na_matriz(matriz, inteiro):
    for linha in matriz:
        for num in linha:
            if num == inteiro:
                return True
    return False

# Exemplo de uso:
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

inteiro1 = 5
inteiro2 = 10

existe_inteiro1 = verificar_inteiro_na_matriz(A, inteiro1)
existe_inteiro2 = verificar_inteiro_na_matriz(A, inteiro2)

print(f'O inteiro {inteiro1} existe na matriz? {existe_inteiro1}')  # Retorna True
print(f'O inteiro {inteiro2} existe na matriz? {existe_inteiro2}')  # Retorna False
