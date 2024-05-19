#verificar soma

numeros = [1,10,8,7,4,6,12,1]
soma = 48
soma_tempo = 0
i = 0
while i < len(numeros) and soma_tempo <= soma:
    soma_tempo += numeros[i]
if soma_tempo > soma:
    print(f'A o valor soma dos valores da lista é maior que o valor soma: {soma}')
else:
    print(f'A soma dos valores da lista não é maior que o valor soma')

    