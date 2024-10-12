
pesos = [100, 110, 101, 99, 94, 101, 100, 106, 103, 97, 94, 108, 98, 100, 102]

peso_correto = 100
tolerancia = 5
descarte = []

for i in range(len(pesos)):
    peso = pesos[i]
    if peso < (peso_correto - tolerancia) or peso > (peso_correto + tolerancia):
        descarte.append(i)

print("Índices dos produtos a serem descartados:", end=" ")
for i in range(len(descarte)):
    if i == len(descarte) - 1:
        print(descarte[i])
    else:
        print(descarte[i], end=", ")
