from random import randint

def sorteio(min, max):
    return randint(min, max)

def realizar_sorteio(apostadores):
    while True:
        numero_sorteado = sorteio(1, 100)
        print(f"Número sorteado: {numero_sorteado}")

        if numero_sorteado in apostadores:
            print(f"Temos um vencedor! O apostador com o número {numero_sorteado} ganhou.")
            break
        else:
            print("Nenhum vencedor. Sorteando novamente...")

apostadores = [5, 20, 35, 50, 65, 80, 95]
realizar_sorteio(apostadores)
