#Algoritmo que recebe uma palavra e conta quantas vogais há na palavra

palavra = 'abacaxi com limao'

contador = {}
vogais = 'aeiou'

for vogal in vogais:
     contador[vogal] = 0

for letra in palavra:
    for vogal in vogais:
         if letra == vogal:
            contador[vogal] +=1
            
print(contador)

contagem = {'a': 0, 'e': 0, 'i': 0, 'o': 0, 'u': 0}

cont = 0
for letra in palavra:
    for vogal in contagem:
        if letra == vogal:
            cont+=1
print(cont)
