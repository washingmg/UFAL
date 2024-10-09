def calcular_peso_ideal(nome, altura, sexo):
    if sexo.upper() == 'M':
        peso_ideal = (72.7 * altura) - 58
    elif sexo.upper() == 'F':
        peso_ideal = (62.1 * altura) - 44.7
    else:
        return "Sexo inválido"
    return f"{nome}, seu peso ideal é {peso_ideal:.2f} kg"


nome = input("Digite o nome da pessoa: ")
altura = float(input("Digite a altura da pessoa (em metros): "))
sexo = input("Digite o sexo da pessoa (M ou F): ")

print(calcular_peso_ideal(nome, altura, sexo))
