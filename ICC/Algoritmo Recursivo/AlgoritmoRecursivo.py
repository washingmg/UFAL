def fatoiral_iterativo(numero):
    fatorial = 1
    while numero > 1:
        fatorial*=numero
        numero -= 1

    return fatorial

def fatorial_recursivo(numero):
    if numero == 0:
        return 1
    else:
        return numero * fatorial_recursivo(numero - 1)

print('----- Aviso -----')
print('O fatorial so é aplicado a numeros não negativos e inteiros!')


while True:
    while True:
        print()
        numero = int(input('Digite o número a ser fatorado:  '))
        if numero < 0:
            print('Somente número positivo!')
        else:
            print(f'O fatorial iterativo do N° {numero} é {fatoiral_iterativo(numero)}')
            print(f'O fatorial recursivo do N° {numero} é {fatorial_recursivo(numero)}')
            break
    print('')
    continuar = str(input('\tDeseja continuar? [S/N]:  ')).lower()
    if continuar == 'n':
        print('Sistema finalizado!')
        break


