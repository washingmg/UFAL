vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [1,2,3,5,12,14,15,21,24,45,46,47,53,86,90,98]

def buscaSequencialRecursiva(vetor, num, tipo_vetor, indice=0, comparacao=0):
    if indice == len(vetor):
        return f'Numero: {num} ,Tamanho: {len(vetor)}, Índice: Número não localizado, Comparações: {comparacao}, Vetor: {tipo_vetor}'

    comparacao += 1

    if vetor[indice] == num:
        return f'Numero: {num} ,Tamanho: {len(vetor)}, Índice: {indice}, Comparações: {comparacao}, Vetor: {tipo_vetor}'
    
    return buscaSequencialRecursiva(vetor, num, tipo_vetor, indice + 1, comparacao )

print('-=-=-=-=-=-  PROGRAMA DE BUSCA SEQUENCIAL RECURSIVA  -=-=-=-=-=-=-\n')

print(buscaSequencialRecursiva(vetor1, 14, '1'))
print(buscaSequencialRecursiva(vetor2, 14, '2'))
print(buscaSequencialRecursiva(vetor1, 46, '1'))
print(buscaSequencialRecursiva(vetor2, 46, '2'))
print(buscaSequencialRecursiva(vetor1, 90, '1'))
print(buscaSequencialRecursiva(vetor2, 90, '2'))
print(buscaSequencialRecursiva(vetor1, 50, '1'))
print(buscaSequencialRecursiva(vetor2, 50, '2'))
