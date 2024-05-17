#Buscar caracter na palavra

palavra = 'algoritmo'
caracter = 'h'

i = 0
while i < len(palavra) and caracter != palavra[i]:
    i+=1
if i == len(palavra):
    print(f'O caracter {caracter} não foi encontrado na palavra!')
else:
    print(f'O caracter {caracter} está na palavra e na posição {i}')
    