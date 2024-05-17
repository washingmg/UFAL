#solicite ao usuário que digite um n° par e positivo
#repita a operação até ele digitar um n° válido

print('Digite um número par e positivo')

while True:
    numero = float(input('Digite o número:  '))
    if numero < 0 or numero % 2 == 1:
        print('Número inválido')
    else:
        print('Número válido')
        break