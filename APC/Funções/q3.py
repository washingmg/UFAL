#  Escreva um programa que possui uma função que recebe uma lista e 
#  diz qual a soma máxima entre dois elementos da lista

def soma_maxima(lista):
    if len(lista) < 2:
        return "A lista precisa ter pelo menos dois elementos para ter um segundo maior valor."

    maior = maior2 = 0
    for num in lista:
        if num > maior:
            maior2 = maior
            maior = num
        
        elif maior2 < num and maior2 != maior: #condição para verificar o segundo maior
            maior2 = num
        
    return maior + maior2
            
numeros = [3, 1, 4, -10]
resultado = soma_maxima(numeros)

print(f'A maior soma entre dois números na lista é: {resultado}')