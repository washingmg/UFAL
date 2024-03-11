vetor1 = [14,21,5,45,12,3,86,98,46,53,24,2,1,15,90,47]
vetor2 = [1,2,3,5,12,14,15,21,24,45,46,47,53,86,90,98]

def buscaBinRecuriva(vetor, numero, tipo_vetor, inicio= 0, fim= None, comparacao= 0):

    if fim is None: # Como o fim não pode ser fim = len(vetor), faz-se o uso desse if
        fim = len(vetor)

    if inicio > fim:
        print(f'Numero: {numero}, Índice: Número não localizado, Vetor: {tipo_vetor}, Comparações: {comparacao + 1}')
        return - 1 #condição de parada
    
    meio = (inicio + fim) // 2 # Encontrar o meio

    if vetor[meio] == numero: # Verifica se o elemento do meio é igual ao alvo
        print(f'Numero: {numero}, Índice: {meio}, Vetor: {tipo_vetor}, Comparações: {comparacao + 1}')
        # return meio # o indice é igual ao meio

    elif vetor[meio] < numero: # Se o elemento do meio for menor que o alvo, descarta a metade esquerda
        # O início fica como parâmetro na função
        return buscaBinRecuriva(vetor, numero, tipo_vetor, meio + 1, fim, comparacao + 1)
    
    else:
        # Fim fica como parâmetro na função
        return buscaBinRecuriva(vetor, numero, tipo_vetor, inicio, meio - 1, comparacao + 1)

print('-=-=-=-=-=-  PROGRAMA DE BUSCA BINÁRIA  -=-=-=-=-=-=-\n')
buscaBinRecuriva(vetor1,14,'1')
buscaBinRecuriva(vetor2,14,'2')
buscaBinRecuriva(vetor1,46,'1')
buscaBinRecuriva(vetor2,46,'2')
buscaBinRecuriva(vetor1,90,'1')
buscaBinRecuriva(vetor2,90,'2')
buscaBinRecuriva(vetor1,50,'1')
buscaBinRecuriva(vetor2,50,'2')

# COMENTÁRIO    
#   Para que obtermos a quantidade de comparações, basta colocar como parâmetro na função uma variável "comparacao = 0" 
# (o =0 é para ela ser inicializada com 0), e se determinada condição for possível, += 1 será somado a variável.
# Basicamente é a mesma coisa do inicio e fim.