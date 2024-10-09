def calcular_salario(total_horas, salario_hora):
    horas_extras = 0
    if total_horas > 40:
        horas_extras = total_horas - 40
        total_horas = 40
    salario_base = total_horas * salario_hora
    salario_extras = horas_extras * salario_hora * 1.5
    return salario_base + salario_extras

horas_trabalhadas = int(input('digite número de horas trabalhadas: '))
salario_por_hora = int(input('digite valor da hora de trabalho: '))

salario_total = calcular_salario(horas_trabalhadas, salario_por_hora)
print(f"Salário total na semana: R${salario_total:.2f}")
