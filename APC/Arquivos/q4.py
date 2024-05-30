# 4. Faça um programa que leia a temperatura média de cada mês do ano em um arquivo e armazene-as em uma lista. Em seguida, 
# calcule a média anual das temperaturas e mostre a média calculada juntamente com todas as temperaturas acima da média anual,
# e em que mês elas ocorreram 
# (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro, . . . ).

#Escrever o conteu da lista no arquivo
def abrirArquivo(caminho):
    with open(caminho) as arquivo:
        x = []
        for linha in arquivo.readlines():
            linha = linha.replace('\n','')
            x.append(float(linha))
    return x

def mediaAnual(caminho):
    temp = abrirArquivo(caminho)
    media = sum(temp) / len(temp)
    return media

def tempAcima(caminho):
    tempo = ['Janeiro','fervereiro','Abril','Maio','Março','Junho','Julho','Agosto','Setembro','Outubro','Novembro','Dezembro']
    media = mediaAnual(caminho)
    temp = abrirArquivo(caminho)

    for i, v in enumerate(temp):
        if v > media:
            print(f'O mês de {tempo[i]} teve uma temperatura de {v}°C')
    
  
fcaminho = r'C:\Users\wmede\Desktop\Wpy\SALA.py\Arquivo.py\temp.txt'
(abrirArquivo(fcaminho))
print(f'Media anual de temperatuas {mediaAnual(fcaminho)}')
tempAcima(fcaminho)
