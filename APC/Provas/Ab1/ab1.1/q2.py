
idade = int(input("Digite a idade do empregado: "))
anos_trabalho = int(input("Digite o número de anos trabalhados: "))

if idade >= 65:
    print("Pode se aposentar")
elif anos_trabalho >= 30:
    print("Pode se aposentar")
elif idade >= 60 and anos_trabalho >= 25:
    print("Pode se aposentar")
else:
    print("Não pode se aposentar")
