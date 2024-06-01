# 7. Faça um programa que tenha duas funções, uma para calcular a 
# média e outra para calcular a variância de um conjunto de números.

def calcular_media(notas):
    soma = 0
    for num in notas:
        soma+=num
    media = soma / len(notas)
    return media


def calcular_variancia(notas):
    media = calcular_media(notas) # retorna a média da função anterior
    variancia = 0
    for num in notas: # para cada num em notas calcule variancia
        variancia +=((num - media)**2) / len(notas)
    return variancia
    
    
    
    
    
    
    
    
    
    
    
numeros = [3,5,7,9,11]
calcular_media(numeros)
resultado = calcular_variancia(numeros)
print(resultado)