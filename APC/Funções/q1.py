# 1. Escreva um programa que possui uma função “maior”, 
# que recebe uma lista e devolve o maior elemento na lista

def maior(lista):
    maior = 0
    for num in lista:
        if num > maior:
            maior = num
    return maior
    
    
    
    
numeros = [4,8,9,2,1,-1]
print(maior(numeros))