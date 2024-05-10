# contar números negativos

numeros = [-5,0,5,-3,-4,1,7,9,1]

cont = 0
for num in numeros:
    if num < 0:
        cont+=1
print(f'O total de número negativos: {cont}')

#//////////////////////////////////////////

cont = 0
numeros = [1,-5,3,5,-7,-3]
for i in range(len(numeros)):
    if numeros[i] <0:
        cont+=1
print(f'N° menores que 0: {cont}')

#//////////////////////////////////////////

"Faça um programa que recebe um conjunto de inteirs e verifica se existe algum número negativo no conjunto"

numeros = [1,3,4,-7]
existe = False
for i in range(len(numeros)): #usando o len da para acessar a posição
    if numeros[i] < 0:
        existe = True
if existe == True:
    print('Nessa lista existe N° negativos')
else:
    print('Nessa lista não existe N° negativos')

    