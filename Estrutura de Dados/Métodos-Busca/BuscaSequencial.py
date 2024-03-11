
vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [1,2,3,5,12,14,15,21,24,45,46,47,53,86,90,98]

def buscaSequencial(vetor, num, tipo_vetor):
    
    tamanho = len(vetor)
    indice = -1
    comparacao, i = 0, 0

    while i < tamanho:
        comparacao +=1
        if vetor[i] == num:
            indice = i
            break
        i+=1

    if indice < 0:
        indice = 'Número não localizado'
        
    print(f'Numero: {num} ,Tamanho: {tamanho}, Índice: {indice}, Comparações; {comparacao}, Vetor: {tipo_vetor}')


print('-=-=-=-=-=-  PROGRAMA DE BUSCA SEQUENCIAL  -=-=-=-=-=-=-\n')

buscaSequencial(vetor1,14,'1')
buscaSequencial(vetor2,14,'2')
buscaSequencial(vetor1,46,'1')
buscaSequencial(vetor2,46,'2')
buscaSequencial(vetor1,90,'1')
buscaSequencial(vetor2,90,'2')
buscaSequencial(vetor1,50,'1')
buscaSequencial(vetor2,50,'2')
