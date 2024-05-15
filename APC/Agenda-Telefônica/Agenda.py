import os

def buscarContato(nome):

    existeContato = False
    if os.path.exists(caminho):
        with open(caminho,'r') as arquivo:
            for linha in arquivo.readlines():
                atributo = linha.strip().split('-')
                contato = atributo[0]
                telefone = atributo[1]
                if contato == nome:
                    print(nome, telefone)
                    existeContato = True
            if not existeContato:
                print('Contato não encontrado')
    else:
        print('Agenda não existe')

import os

def adicionarContato(nome, telefone):
    if os.path.exists(caminho):
        with open(caminho, 'r') as arquivo:
            contato_existe = False
            for linha in arquivo:
                if nome in linha:
                    contato_existe = True
                    break

            if contato_existe:
                print('Esse contato já existe')
            else:
                with open(caminho, 'a') as arquivo:
                    arquivo.write(f'{nome}-[{telefone}]\n') 
                    print('Contato adicionado!')
    else:
        with open(caminho, 'w') as arquivo:
            arquivo.write(f'{nome}-[{telefone}]\n')
            print('Contato adicionado!')


def removerContato(nome):
    
    existeContato = False
    if os.path.exists(caminho):
        with open(caminho,'r') as arquivo:
            linhas = arquivo.readlines()
        
        with open(caminho,'w') as arquivo:
            for linha in linhas:
                atributo = linha.strip().split('-')
                contato = atributo[0]
                if contato != nome:
                    arquivo.write(linha)
                else:
                    existeContato = True
                    print('Contato removido!')
            if not existeContato:
                print('Contato não encontrado!')
    else:
        print('Agenda vazia!')

def adicionarTelefone(nome,telefone):
    existe_contatos = False
    if os.path.exists(caminho):
        with open(caminho,'r') as arquivo:
            linhas = arquivo.readlines()

        with open(caminho,'w') as arquivo:
            for linha in linhas:
                atributo = linha.strip().split('-')
                contato = atributo[0]
                telefones = atributo[1]
                telefones = telefones.replace('[', '').replace(']', '').replace('"', '').split(',')
                telefones.append(int(telefone))
                if contato == nome:
                    arquivo.write(f'{contato}-{telefones}'+ '\n')
                    print('Telefone adicionado')
                    existe_contatos = True
                else:
                    arquivo.write(linha)
                    print('Contato editado')
            if not existe_contatos:
                print('Esse contato não existe')
    else:
        print('agenda sem contatos')

def removerTelefone(nome,telfone):
    existe_contatos = False
    if os.path.exists(caminho):
        with open(caminho,'r') as arquivo:
            linhas = arquivo.readlines()

        with open(caminho,'w') as arquivo:
            for linha in linhas:
                atributo = linha.strip().split('-')
                contato = atributo[0]
                telefones = atributo[1]
                if contato != nome:
                    arquivo.write(linha)
                else:
                    telefones = telefones.replace('[', '').replace(']', '').replace('"', '').split(',')
                    for telefone in telefone:
                        telefones.remove(telefone)
                        editado = f'{nome}-{telefones}'
                        arquivo.write(editado)
                        existe_contatos = True
                    else:
                        arquivo.write(linha)
            if not existe_contatos:
                print('Contato não encontrado')
    else:
        print('Agenda vazia')

def editarContato(nome,novoNome):
    
    existeContato = False
    if os.path.exists(caminho):
        with open(caminho) as arquivo:
            linhas = arquivo.readlines()
        
        with open(caminho,'w') as arquivo:
            for linha in linhas:
                atributo = linha.strip().split()
                contato = atributo[0]
                if contato != nome:
                    arquivo.write(linha)
                else:
                    editado = f'{novoNome},{atributo[1]}' #retorna os telfeones do contato antes de ser editado
                    arquivo.write(editado)
                    existe_contatos = True
            if not existe_contatos:
                print('Esse contato não existe')
    else:
        print('agenda sem contatos')


caminho = r'C:\Users\wmede\Desktop\Wpy\SALA.py\Arquivo.py\agenda.txt'

while True:
    print("\n===== Agenda Telefônica =====")
    print("1 - Buscar Contato")
    print("2 - Adicionar Contato")
    print("3 - Remover Contato")
    print("4 - Adicionar Telefone")
    print("5 - Remover Telefone")
    print("6 - Editar Contato")
    print("7 - Listar Contatos")
    print("0 - Sair")
    print()
    
    opc = int(input('Digite uma opção: '))

    if opc == 1:
        nome_buscado = input('digite o nome do contato: ')
        buscarContato(nome_buscado)
        
    elif opc == 2:
        nomeAdic = input('digite nome do contato: ')
        telefone = input('digite telefone: ')
        adicionarContato(nomeAdic,telefone)

    elif opc == 3:
        remover_contato = input('Digite o contato a ser removido:  ')
        removerContato(remover_contato)

    elif opc == 4:
        nome_contato = input('Digite o contato a ser acrescentado  o telefone:  ')
        telefone = (input('Digite o telefone:  '))
        adicionarTelefone(nome_contato,telefone)
        
    elif opc == 5:
        nome = input('Digite o nome a ter o telfone removido:  ')
        telefone = input('Digite o tefone a ser removido:  ')
        removerTelefone(nome,telefone)


    elif opc == 6:
        editar_contato = input('Digite o contato a ser editado:  ')
        nome_novo =input('Digite o novo nome:  ')
        editar_contato(editar_contato,nome_novo)
         
                    
    elif opc == 7:
        
        arquivo = open(caminho)
        for linha in arquivo.readlines():
            print(linha.replace('\n',''))
        arquivo.close()

    elif opc == 0:
        print('Você saiu da Agenda Telefônica')
        break
        