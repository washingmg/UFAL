# 3. Faça um programa que leia um número qualquer de notas em um arquivo. Após a leitura dos dados, faça o seguinte:
# Mostre a quantidade de notas que foram lidas.
# Exiba todas as notas na ordem em que foram informadas.
# Calcule e mostre a soma das notas.
# Calcule e mostre a média das notas.
# Calcule e mostre a quantidade de notas acima da média calculada.

def abrir_arquivo(caminho):
    notas = []
    with open(caminho) as arquivo:
        for linha in arquivo.readlines():
            linha = linha.replace('\n','')
            notas.append(linha)
    return notas

def calcular_notas(caminho):
    notas = abrir_arquivo(caminho)
    x = []
    for nota in notas:
        nota = nota.replace("'",'')
        x.append(float(nota))
    a = round(sum(x),2)
    return a

def notas_acima_media(caminho):
    notas = abrir_arquivo(caminho)
    maior_media = (calcular_notas(caminho) / len(abrir_arquivo(caminho)))
    x = []
    y = []
    for nota in notas:
        nota = nota.replace('\n','')
        x.append(float(nota))
    for nota in x:
        if nota > maior_media:
            y.append(nota)
    return y

a = 'alunosNotas.txt'
print(f'Notas no arquivo: {abrir_arquivo(a)}')
print(f'Quantidade de notas no arquivo: {len(abrir_arquivo(a))}')
print(f'Soma das notas: {(calcular_notas(a))}')
print(f'Média das notas: {calcular_notas(a) / len(abrir_arquivo(a))}')
print(f'Notas acima da média: {notas_acima_media(a)}')