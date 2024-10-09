
total_horas = float(input("Digite o número de horas trabalhadas na semana: "))
salario_hora = float(input("Digite o salário por hora: "))

if total_horas > 40:
    horas_extras = total_horas - 40
    salario_base = 40 * salario_hora
    salario_extras = horas_extras * salario_hora * 1.5
else:
    horas_extras = 0
    salario_base = total_horas * salario_hora
    salario_extras = 0

salario_total = salario_base + salario_extras
print(f"Salário total na semana: R${salario_total:.2f}")
