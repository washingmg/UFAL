
nome = input("Digite o nome da pessoa: ")
peso = float(input("Digite o peso da pessoa (em kg): "))
altura = float(input("Digite a altura da pessoa (em metros): "))

imc = peso / (altura ** 2)

if imc < 18.5:
    classificacao = "abaixo do peso"
elif 18.5 <= imc < 25:
    classificacao = "peso normal"
elif 25 <= imc < 30:
    classificacao = "pré-obesidade"
elif 30 <= imc < 35:
    classificacao = "obesidade grau 1"
elif 35 <= imc < 40:
    classificacao = "obesidade grau 2"
else:
    classificacao = "obesidade grau 3"

print(f"{nome}, seu IMC é {imc:.2f} e sua classificação é {classificacao}.")
