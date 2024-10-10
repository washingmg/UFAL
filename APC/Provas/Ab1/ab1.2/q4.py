
dias = int(input("Digite o número de dias de hospedagem: "))

diaria = 150

if dias > 5:
    taxa_servico = 7.50
elif dias == 5:
    taxa_servico = 9.00
else:
    taxa_servico = 10.50

valor_total = (diaria + taxa_servico) * dias
print(f"Valor a ser cobrado: R${valor_total:.2f}")
