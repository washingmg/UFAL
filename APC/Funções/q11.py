# 2. Escreva um programa que lê duas notas de vários alunos e armazena tais notas em um dicionário, 
# onde a chave é o nome do aluno.
# A entrada de dados deve terminar quando for lida uma string vazia como nome.
# Escreva uma função que retorna a média do aluno, dado seu nome.
#2° calcular a media do aluno usando uma função e retornar o valor:

def calcular_media(notas):
    soma = 0
    for num in notas:
        soma += num
    media = soma / len(notas)
    return media

def media_aluno(dicionario,nome):
    for nome in dicionario: # se o nome estiver no dicionario
        return calcular_media(dicionario[nome]) #retorne a média
    else:
        return None #se n, retorne vazio
    
def adicionar_aluno(diconario,nome,notas):
    diconario[nome] = notas
    #alunos_notas = {'was':[1.0,2.0]} saida



alunos_notas = {}

while True:
    nome = str(input('Digite o nome: (para sair aperte enter)  '))
    nota1 = float(input('Digite a nota1:  '))
    nota2 = float(input('Digite a nota2:  '))

    adicionar_aluno(alunos_notas,nome,[nota1,nota2])
    sair = str(input('Deseja sair?  '))
    if sair == '':
        break
nome_buscar = str(input('Digite o nome para calcular a média'))    

media_aluno(alunos_notas,nome_buscar)
media = media_aluno(alunos_notas,nome_buscar)

if media is not None:
    print(f"A média do aluno {nome_buscar} é {media:.2f}.")
else:
    print(f"O aluno {nome_buscar} não foi encontrado.")

print(alunos_notas)
