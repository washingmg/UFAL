#crie uma agenda que dê para adionar város nomes e ver se eles está na lista

#1° ciramos um dicionário vazio para que possa ser preenchido

agenda = {}

#2° criamos um loop para adiconarmos as perguntas

sair = False
while not sair: #enquanto não sair == false, o
    nome = str(input('Digite o nome: '))
    telefone = int(input('Digite o telefone:  '))
    agenda[nome] = telefone
    s = input('Deseja sair (s/n)').lower()
    if s == 's':
        sair = True
    else:
        sair = False


#3° perguntamos o nome a ser buscado

buscar = str(input('Qual nom você quer buscar:  '))
print(agenda)

#4° criamos uma função para procurar o nome no diconário
def buscar_nome(pessoa):
    chaves = agenda.keys()  #vai ter as chaves no diocinária aqui
    for c in chaves: #para c in cheves
        if c == pessoa:
            return True #tem essa chave
    return False

if buscar_nome(buscar): #complemento do def
    print(buscar, agenda[buscar])
else:
    print('nome não encontrado')
