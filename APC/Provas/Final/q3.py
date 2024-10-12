def verificar_cartela(cartela, sorteados):
    for j in range(4):
        venceu = True
        for i in range(4):
            if cartela[i][j] not in sorteados:
                venceu = False
                break
        if venceu:
            return True
    return False

sorteados = [3, 4, 7, 16, 17, 20, 21, 22, 26, 27, 30, 36, 48, 51]

cartela = [
    [1, 16, 33, 49],
    [3, 21, 39, 51],
    [9, 22, 41, 57],
    [13, 27, 42, 60]
]

if verificar_cartela(cartela, sorteados):
    print("Cartela vencedora")
else:
    print("Cartela não vencedora")
