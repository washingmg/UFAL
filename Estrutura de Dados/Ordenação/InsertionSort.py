vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [2,0,-5,-1,3,10,43,12,-2,-2,1,4,6,8,23]
veotr3 = [1,2,3,4,5]

def insertionSort(vetor):

    n = len(vetor)
    for i in range(1,n):
        key = vetor[i]

        j = i - 1
        while j >= 0 and key < vetor[j]:            # Loop para encontrar a posição correta para inserir o elemento selecionado.
            vetor[j+1] = vetor[j]
            j -= 1

        vetor[j+1] = key   # Insere o elemento na posição correta na sublista ordenada.
    
    return vetor

print(insertionSort(vetor1))
print(insertionSort(vetor2))
print(insertionSort(veotr3))

# O(n²)
# vai empurrando