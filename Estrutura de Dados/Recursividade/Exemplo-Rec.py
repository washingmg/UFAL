def mostrarRec(n, ordem= 1): #A ordem como parâmetro não tem problrma na recursão e também será atualizado
    y = 10 #variável global
    # O "y" ou sempre será 10 ou 2
    if n == 1:
        print(f'{ordem} - Estrutura de Dados')
    else:
        y = 2 #variável local
        print(f'{ordem} - Estrutura de Dados')
        mostrarRec(n - 1, ordem + 1)

mostrarRec(5)