# 3. Escreva um programa para armazenar uma agenda de telefones em um dicionário.
# Cada pessoa pode ter um ou mais telefones e a chave do dicionário é o nome da pessoa. 
# Seu programa deve ter as seguintes funções:
# incluirNovoNome – essa função acrescenta um novo nome na agenda, com um ou mais telefones.
# Ela deve receber como argumentos o nome e os telefones. 

# incluirTelefone – essa função acrescenta um telefone em um nome existente na agenda.
# Caso o nome não exista na agenda, você deve perguntar se a pessoa deseja incluí­-lo.
# Caso a resposta seja afirmativa, use a função anterior para incluir o novo nome. 
# ­ excluirTelefone – essa função exclui um telefone de uma pessoa que já está na agenda. 
# Se a pessoa tiver apenas um telefone, ela deve ser excluída da agenda. ­ 
# excluirNome – essa função exclui uma pessoa da agenda. ­

# consultarTelefone – essa função retorna os telefones de uma pessoa na agenda. 


def incluirNome(agenda,nome,telefone): 
    agenda[nome] = telefone 

def incluirTelefone(agenda,nome,telefone):
    if not agenda.get(nome):
        incluirNome(agenda, nome, [telefone]) 
    else:
        agenda[nome].append(telefone)

def excluirNome(agenda,nome):
        del agenda[nome]

def buscaTelefone(telefones,telefone): 
    i = 0
    while i < len(telefones) and telefones[i] != telefone:
        i+=1
    
    if i < len(telefones):
        return i    
    else:
        return -1
    
def excluirTelefone(agenda,nome,telefone):
    if agenda.get(nome):
        telefones = agenda[nome] 
        posicao = buscaTelefone(telefones,telefone) #vai verificar a posição do telefone
        if posicao >= 0: #caso exista o telefone
            agenda[nome].pop(posicao)
        if len(agenda[nome]) == 0:
            excluirNome(agenda,nome)

      
agenda = {} 
 
incluirNome(agenda,'ana',[123,321])
incluirNome(agenda,'bob',[456])
incluirNome(agenda,'carla',[789,987,999])
print(agenda)
incluirTelefone(agenda,'bob',654)
incluirTelefone(agenda,'josé',555)
print(agenda)
excluirNome(agenda,'josé')
print(agenda)
excluirTelefone(agenda,'ana',123)
print(agenda)
excluirTelefone(agenda,'ana',321)
print(agenda)
excluirTelefone(agenda,'arnaldo',321)
print(agenda)
excluirTelefone(agenda,'bob',777)
print(agenda)