'Faça um programa que recebe um conjunto de inteiros e um valor n e verifica se existe algum número com'
'valor maior que n no conjunto'

numeros = [1,3,2,5,0]
n = 5

existir = False
for i in range(len(numeros)):
    if n < numeros[i]:
        existir = True
if existir == True:
    print('Existe')
else:
    print('não')