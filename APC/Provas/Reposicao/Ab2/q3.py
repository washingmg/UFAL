from random import randint

def sorteio(min, max):
    return randint(min, max)

def realizar_loteria(bilhetes):
    numeros_sorteados = set()

    while True:
        numero = sorteio(1, 60)
        numeros_sorteados.add(numero)
        print(f"Número sorteado: {numero}")

        for bilhete in bilhetes:
            if set(bilhete).issubset(numeros_sorteados):
                print(f"Temos um vencedor! Bilhete: {bilhete}")
                return

bilhetes = [
    [1, 7, 45, 12],
    [13, 29, 60, 45],
    [8, 14, 29, 35],
    [58, 2, 40, 22]
]

realizar_loteria(bilhetes)
