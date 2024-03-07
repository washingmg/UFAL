vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [2,0,-5,-1,3,10,43,12,-2,-2,1,4,6,8,23]
veotr3 = [1,2,3,4,5]

def bubbleSort(vetor):
    
    n = len(vetor)
    # Lado direito, pois o maior vai ficando ao lado diretiro, quantidade de "Bolhas"
    for i in range(n): 
        troca = False

    # Recuando 1, está do lado esquerdo, pois é menor, onde se faz as comparações    
        for j in range(0,n-i-1):
            if vetor[j] > vetor[j+1]: 
                vetor[j], vetor[j+1] = vetor[j+1], vetor[j] 
                troca = True
                
    # Se não tiver troca, pare!
        if not troca:
            break

    return vetor
         
print(bubbleSort(vetor1))
print(bubbleSort(vetor2))
print(bubbleSort(veotr3))

# * As mudanças que ocorrem no 'for' ficam armazenada no próprio vetor, lá no parâmetro
# * O maior vai pro final
# * Comparando aos pares, o maior número vai pro final logo de primeira
# * COmplexidade Geral: O(n²)