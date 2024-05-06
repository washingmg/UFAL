vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [2,0,-5,-1,3,10,43,12,-2,-2,1,4,6,8,23]
vetor3 = [1,2,3,4,5]
vetor4 = [6]
def mergeSort(vetor):
    
    if len(vetor) > 1:
        meio = len(vetor) // 2
        metade_esquerda = vetor[:meio]
        metade_direita = vetor[meio:]

        mergeSort(metade_esquerda)
        mergeSort(metade_direita)

        k, i, j = 0, 0, 0

        while i < len(metade_esquerda) and j < len(metade_direita):
            if metade_esquerda[i] < metade_direita[j]:
                vetor[k] = metade_esquerda[i]
                i+=1
            else:
                vetor[k] = metade_direita[j]
                j+=1
            k+=1
        
        while i < len(metade_esquerda):
            vetor[k] = metade_esquerda[i]
            i+=1
            k+=1

        while j < len(metade_direita):
            vetor[k] = metade_direita[j]
            j+=1
            k+=1

    return vetor        

print(mergeSort(vetor1))
print(mergeSort(vetor2))
print(mergeSort(vetor3))
print(mergeSort(vetor4))


# Merge combina duas metades
# O(n log n)if len(vetor) > 1:
