# 1. Escreva um programa que lê um arquivo contendo a identidade e o nome de várias pessoas, no seguinte formato:
# 5384423 Manoel
# 4345566 Alberto
# 3235574 Mariana
# o programa deve gerar um dicionário no qual as chaves são as identidades e os valores os nomes. Ao final o programa deve exibir o dicionário


def dic_usuarios(caminho):
    with open(caminho) as arquivo:
        usuarios = []
        for linha in arquivo.readlines():
            atributos = linha.replace('\n','').split(' ')
            dic = {atributos[0], atributos[1]}
            usuarios.append(dic)
        return usuarios
    

fcaminho = r'C:\Users\wmede\Desktop\Wpy\SALA.py\Arquivo.py\Identidades.txt'
result = dic_usuarios(fcaminho)
print(result)

# for linha in dic_usuarios(fcaminho):
#     print(linha)