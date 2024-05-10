#Fatorial

numero = 5

if numero < 0:
    print('Não existe fatorial de n° negativo')
else:
    fatorial = 1
    for num in range(1,numero + 1):
        fatorial*=num
    print(fatorial)


    

