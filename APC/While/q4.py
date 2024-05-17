'Verifique se a soma dos valores de um conjunto é maior que n'

lista = [1,3,8,4,6,10,8]
n = int(input('Digite um N° inteiro:  '))

i = 0
soma = 0
for num in lista:
    soma+=num
while i <(len(lista) and n < soma): 
                    # while i < len(lista) and soma <= n:
                    #     soma +=lista[i]
                    #     i+=1
    i+=1
if i == len(lista): 
    print(f'A soma dos valores do conjunto não é maior que {n}')
else:
    print(f'A soma dos valores do conjunto é maior que {n}')
    
    




