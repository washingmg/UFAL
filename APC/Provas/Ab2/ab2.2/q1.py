
def encontrar_maiores_sequencias(nome_arquivo):
    with open(nome_arquivo, 'r') as arquivo:
        for linha in arquivo:
            numeros = list(map(int, linha.split()))
            if numeros:
                maior = max(numeros)
                print(maior)


nome_arquivo = r'C:\Users\wmede\Documents\GitHub\UFAL\APC\Provas\Ab2\ab2.2\sequencias.txt'

encontrar_maiores_sequencias(nome_arquivo)
