vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [2,0,-5,-1,3,10,43,12,-2,-2,1,4,6,8,23]
veotr3 = [1,2,3,4,5]

def selectionSort(vetor):
    
    n = len(vetor)

    for i in range(n):
        lowest_index = i

        for j in range(i+1,n):
            if vetor[j] < vetor[lowest_index]:
                lowest_index = j
        
        if vetor[i] != vetor[lowest_index]:
            vetor[i], vetor[lowest_index] = vetor[lowest_index], vetor[i]
    
    return vetor    # Retorna o vetor ordenado.


print(selectionSort(vetor1))
print(selectionSort(vetor2))
print(selectionSort(veotr3))


# Pior caso = vetor já ordenado
# Melhor caso = Decreste
