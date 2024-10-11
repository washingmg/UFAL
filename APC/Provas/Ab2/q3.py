
pessoas = [
    {"nome": "Ana", "peso": 70, "altura": 1.75},
    {"nome": "Bruno", "peso": 85, "altura": 1.80},
    {"nome": "Carlos", "peso": 50, "altura": 1.60},
    {"nome": "Diana", "peso": 95, "altura": 1.70}
]

for pessoa in pessoas:
    nome = pessoa["nome"]
    peso = pessoa["peso"]
    altura = pessoa["altura"]
    imc = peso / (altura ** 2)
    
    if imc < 18.5:
        classificacao = "Abaixo do peso"
    elif 18.5 <= imc < 25:
        classificacao = "Peso normal"
    elif 25 <= imc < 30:
        classificacao = "Acima do peso"
    else:
        classificacao = "Obesidade"
    
    print(f"Nome: {nome}, Peso: {peso} kg, Altura: {altura} m, IMC: {imc:.2f}, Classificação: {classificacao}")
