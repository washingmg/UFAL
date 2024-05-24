# 2. Escreva um programa que possui uma função que recebe uma lista e
# um valor e verifica se existe o valor na lista

def verificar(lista,valor):
    i = 0
    while i <len(lista) and valor != lista[i]:
        i+=1
    if i == len(lista):
        valor = False
    else:
        valor = True
    return valor
    
    
    
    
lista = [1,7,4,2,9,0]
valor = 3

print(verificar(lista,valor))