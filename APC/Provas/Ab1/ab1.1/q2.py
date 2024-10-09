def verificar_aposentadoria(idade, anos_trabalho):
    if idade >= 65:
        return "Pode se aposentar"
    elif anos_trabalho >= 30:
        return "Pode se aposentar"
    elif idade >= 60 and anos_trabalho >= 25:
        return "Pode se aposentar"
    else:
        return "Não pode se aposentar"

idade = int(input("Digite a idade do empregado: "))
anos_trabalho = int(input("Digite o número de anos trabalhados: "))

resultado = verificar_aposentadoria(idade, anos_trabalho)
print(resultado)
