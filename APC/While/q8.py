#calcular o valor total dos preços

preco = preco_total = 0
while True:
    preco = float(input('Digite o preço do produto:  '))
    preco_total +=preco
    continuar = str(input('Deseja continuar?  '))
    if continuar == 's' or continuar == 'S':
            print('Calculando')
    elif continuar == 'n' or continuar == 'N':
            print('Fazendo a soma..')
            print(f'O valor total da lista é {preco_total}')
            break
        