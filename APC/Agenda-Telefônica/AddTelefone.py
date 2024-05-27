import os

def adicionarTelefone(nome,telefone):
    if os.path.exists(caminho):
        with open(caminho) as arquivo:
            existe_contatos = False
            linhas = arquivo.readlines()
        with open(caminho,'w') as arquivo:
            for linha in linhas:
                atributo = linha.strip().split('-')
                contato = atributo[0]
                telefones = atributo[1]
                if contato != nome:
                    arquivo.write(linha)
                else:
                    existe_contatos = True
                    telefones = telefones.replace('[', '').replace(']', '').replace(' ', '').replace("'",'').split(',')
                    telefones.append(telefone)
                    arquivo.write(f'{contato}-{telefones}\n')
                    print('Telefone adicionado')
                    
            if not existe_contatos:
                print('Contato não encontrado!')
    else:
        print('Lista vazia!')


caminho = r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\agendaTelefone\agenda.txt'
fnome = input('Digite o nome do contato:  ')
ftelefone = input('Digite o telefone a ser adicionado:  ')
adicionarTelefone(fnome,ftelefone)