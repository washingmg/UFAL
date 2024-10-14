def calcular_rendimentos(valores):
    rendimentos = []
    for i in range(1, len(valores)):
        rendimento = round(100 * (valores[i] - valores[i - 1]) / valores[i - 1],2)
        rendimentos.append(rendimento)
    return rendimentos

valores = [50, 53, 55, 52, 51, 56]
rendimentos = calcular_rendimentos(valores)
print(rendimentos)
