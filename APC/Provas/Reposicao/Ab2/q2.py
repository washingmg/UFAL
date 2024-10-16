def identificar_pontos_de_mudanca(serie):
    pontos_de_mudanca = []

    for i in range(1, len(serie) - 1):
        if (serie[i] > serie[i - 1] and serie[i] > serie[i + 1]) or (serie[i] < serie[i - 1] and serie[i] < serie[i + 1]):
            pontos_de_mudanca.append(serie[i])

    return pontos_de_mudanca

serie = [5, 8, 6, 4, 7, 10, 8, 6, 4, 2, 1, 6, 7, 9, 4]
pontos = identificar_pontos_de_mudanca(serie)
print(pontos)
