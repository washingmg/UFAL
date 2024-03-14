def recursiveSelectionSort(vetor, i=0):
    n = len(vetor)

    if i < n - 1:
        lowest_index = i

        for j in range(i + 1, n):
            if vetor[j] < vetor[lowest_index]:
                lowest_index = j

        if vetor[i] != vetor[lowest_index]:
            vetor[i], vetor[lowest_index] = vetor[lowest_index], vetor[i]

        recursiveSelectionSort(vetor, i + 1)

    return vetor

vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [2,0,-5,-1,3,10,43,12,-2,-2,1,4,6,8,23]
vetor3 = [1,2,3,4,5]

print(recursiveSelectionSort(vetor1))
print(recursiveSelectionSort(vetor2))
print(recursiveSelectionSort(vetor3))
