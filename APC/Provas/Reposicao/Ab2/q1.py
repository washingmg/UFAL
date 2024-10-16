def calcular_custos_percentuais(input_file, output_file):
    setores = []
    custos = []
    total_custo = 0

    with open(input_file, 'r') as file:
        for line in file:
            nome, custo = line.strip().split()
            custo = float(custo)
            setores.append((nome, custo))
            custos.append(custo)
            total_custo += custo

    setores_percentuais = [(nome, custo, (custo / total_custo) * 100) for nome, custo in setores]

    with open(output_file, 'w') as file:
        file.write("Nome, Custo, Percentual\n")
        for nome, custo, percentual in setores_percentuais:
            file.write(f"{nome} {custo:.2f} {percentual:.2f}\n")
        file.write(f"total {total_custo:.2f} 100.00\n")

input_file = r'C:\Users\wmede\Documents\GitHub\UFAL\APC\Provas\Reposicao\Ab2\custos.txt'
output_file = r'C:\Users\wmede\Documents\GitHub\UFAL\APC\Provas\Reposicao\Ab2\reletorio.txt'
calcular_custos_percentuais(input_file, output_file)
