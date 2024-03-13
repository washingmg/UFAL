def inverter(frase):
    tamanho = len(frase)

    if tamanho > 1:
        print(frase[tamanho-1])
        inverter(frase[:tamanho-1])
    else:
        print(frase[0])

frase = input("Digite uma frase: ").upper()
inverter(frase)