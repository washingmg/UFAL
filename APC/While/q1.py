#buscar nome e verificar se está na lista

lista = ['ana', 'pedro','carlos', 'jose', 'leonardo', 'sandra','thiago']
nome = 'thiago'

i = 0
while i < len(lista) and nome != lista[i]:
    i+=1
if i == len(lista):
    print(f'O nome {nome} não foi encontrado na lista!')
else:
    print(f'O {nome} está na posição {i} na lista!')
