vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [1,2,3,5,12,14,15,21,24,45,46,47,53,86,90,98]

def buscaBinaria(vetor, numero, tipo_vetor):

    fim = len(vetor)
    inicio, comparacao = 0,0
    indice = 'Numero não localizado'

    while inicio <= fim:
        meio = (inicio + fim) // 2 
        
        if vetor[meio] == numero:
            comparacao +=1
            indice = meio
            break

        elif vetor[meio] < numero: 
            comparacao +=1
            inicio = meio + 1 
        else:
            comparacao += 1
            fim = meio - 1


    print(f'Numero: {numero} ,Tamanho: {fim}, Índice: {indice}, Comparações; {comparacao}, Vetor: {tipo_vetor}')

print('-=-=-=-=-=-  PROGRAMA DE BUSCA BINÁRIA  -=-=-=-=-=-=-\n')
buscaBinaria(vetor1,14,'1')
buscaBinaria(vetor2,14,'2')
buscaBinaria(vetor1,46,'1')
buscaBinaria(vetor2,46,'2')
buscaBinaria(vetor1,90,'1')
buscaBinaria(vetor2,90,'2')
buscaBinaria(vetor1,50,'1')
buscaBinaria(vetor2,50,'2')


