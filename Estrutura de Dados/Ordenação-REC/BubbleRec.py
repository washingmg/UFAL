vetor1 = [14, 21, 5, 45, 12, 3, 86, 98, 46, 53, 24, 2, 1, 15, 90, 47]
vetor2 = [2, 0, -5, -1, 3, 10, 43, 12, -2, -2, 1, 4, 6, 8, 23]
vetor3 = [1, 2, 3, 4, 5]

def bubbleSortRecursive(vetor):
    # Chama a função recursiva para ordenar o vetor completo.
    return recursiveBubbleSort(vetor, len(vetor))

def recursiveBubbleSort(vetor, n):
  
    if n <= 1: 
        return vetor 

    troca = False

    for i in range(0, n-1):
        if vetor[i] > vetor[i+1]:
            vetor[i], vetor[i+1] = vetor[i+1], vetor[i]
            troca = True

    if not troca:
        return vetor

    # Chamada recursiva para a próxima iteração.
    return recursiveBubbleSort(vetor, n-1)

print(bubbleSortRecursive(vetor1))
print(bubbleSortRecursive(vetor2))
print(bubbleSortRecursive(vetor3))
