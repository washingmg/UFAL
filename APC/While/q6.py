'Algoritmo que recebe um conjunto de inteiro e dois N° e verifica se estes dois N° ocorrem em sequência no conjunto'
#lista = [1,3,5,8,6,7,4] n1 = 5 and n2 = 8
print('='*50)

lista = [1,3,7,9,0,1,4,5]
n1 = 4
n2 = 5

existe = False
i = 0
for i in range(len(lista)):
    if n1 == lista[i] and n2 == lista[i + 1]:
        existe = True
if existe == True:
    print('Ocorrem em sequência!')
else: 
    print('Não ocorrem em sequência')

print('='*50)
lista = [1,3,5,8,6,7,4] #1° criamos uma lista com os n°
n1 = 5 #2° criamoas as variáveis que queremos verificar
n2 = 8

existe = False #5° crimaos como falso para caso não encontre a sequência, dê  como falso
for i in range(len(lista)): #3° para o elemento i percorer o tamanho da lista menos o último
    #Foi usado o range pq ele vai tranformar N° total de índices em um tamanho
    #Como usamos um for, que é um loop, ele repetirá o tamnho da lista várias vez7
    #Usamos o -1 para que o 0 não conto e fique mais fácil de se ter algo exato
    if n1 == lista[i] and n2 == lista[i+1]: #4° se n1 for igual a lista[i] e n2 for igual a lista[i + 2]
    
    # o lista[i] serve para verificar o valor que está no índice
    # o lista[i + 1] serve para ver se o valor ocorre logo em sequência
        existe = True #5° cramos essa variável como vdd para dizer que ocorre a sequência
if existe == True:
    print("Existe em sequência na lista")
else:
    print('Não existe em sequência na lista')

print('='*50)
lista = [2,10,5,6,10,11,13,20]
n1 = 10
n2 =11
i = 0
while (i < len(lista)) and (n1 != lista[i] or n2 != lista[i+1]):
    i+=1
if i == len(lista):
    print('Os N° não ocorrem em sequência')
else:
    print('Os N° ocorrem em sequêcia')
