
x = 10
y = 8

taxisx = [21, 40, 35, 17, -42, 82, 60, -1, -15, 25, 29, 0]
taxisy = [25, 30, -1, 45, -20, 60, 0, 26, -10, 52, 36, -1]

menor_distancia = float('inf')
indice_taxi_proximo = -1

for i in range(len(taxisx)):
    distancia = ((taxisx[i] - x) ** 2 + (taxisy[i] - y) ** 2) ** 0.5
    if distancia < menor_distancia:
        menor_distancia = distancia
        indice_taxi_proximo = i

print(f"O índice do taxi mais próximo é: {indice_taxi_proximo}")
