import os

def removerTelefone(nome, telefone):
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
                    telefones = telefones.replace('[', '').replace(']', '').replace(' ', '').replace("'",'').split(',')
                    if telefone in telefones:
                        telefones.remove(telefone)
                        editado = f'{nome}-{telefones}'
                        arquivo.write(editado)
                        print(editado)
                        print('Telefone removido!')
                        existe_contatos = True
                    else:
                        arquivo.write(linha)
            if not existe_contatos:
                print('Esse contato não existe')
    else:
        print('agenda sem contatos')


caminho = r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\agendaTelefone\agenda.txt'

fnome = input('Digite o nome:  ')
ftelefone = input('Digite o telefone:  ')
removerTelefone(fnome,ftelefone)