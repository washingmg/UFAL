def insertionSort(vetor):
    # Chama a função recursiva para ordenar o vetor completo.
    return recursiveInsertionSort(vetor, len(vetor))

def recursiveInsertionSort(vetor, n):
    if n <= 1:
        return vetor

    # Chamada recursiva para ordenar a sublista do vetor (excluindo o último elemento).
    recursiveInsertionSort(vetor, n-1)

    # Seleciona o último elemento da sublista não ordenada.
    key = vetor[n-1]
    j = n - 2
    
    while j >= 0 and key < vetor[j]:
        vetor[j+1] = vetor[j]
        j -= 1
    
    vetor[j+1] = key

    return vetor


# Vetores de exemplo
vetor1 = [14, 21, 5, 45, 12, 3, 86, 98, 46, 53, 24, 2, 1, 15, 90, 47]
vetor2 = [2, 0, -5, -1, 3, 10, 43, 12, -2, -2, 1, 4, 6, 8, 23]
vetor3 = [1, 2, 3, 4, 5]

# Imprime os vetores ordenados
print(insertionSort(vetor1))
print(insertionSort(vetor2))
print(insertionSort(vetor3))
