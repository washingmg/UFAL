'Verifique se existe uma letra em uma palavra'


palavra = 'abacaxi'
letra = 'b'

i = 0
while (i < len(palavra) and letra != palavra[i]):
    i+=1

if i == len(palavra):
    print(f'A letra {letra} não existe na palavra {palavra}')
else:
    print(f'A letra {letra} existe na palavra {palavra}')
print('='*50)

palavra = 'algoritmo' 
letra = 'g' 

i = 0 
while i < len(palavra) and letra != palavra[i]: #3° 
    i = i + 1 
if i == len(palavra): 
    print(f'A letra: {letra} não existe na palavra {palavra}!')
else:
    print(f'A letra: {letra} existe na palavra {palavra}!')
print('='*50)

print('Verificaremos sem em uma X palavra existe X letra')
palavra = str(input('Digite uma palavra:  '))
print('...')


letra = str(input('Digite uma letra:  '))
i = 0
while i < len(palavra) and letra != palavra[i]:
    i += 1
if i == len(palavra):
    print(f'A letra: {letra} não existe na palavra: {palavra}!')
else:
    print(f'A letra: {letra} existe na palavra {palavra}!')