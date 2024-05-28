import os

def editarTelefone(nome, novo):
    caminho = r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\agendaTelefone\agenda.txt'
    if os.path.exists(caminho):
        existeContato = False
        with open(caminho) as arquivo:
            linhas = arquivo.readlines()
        with open(caminho, 'w') as arquivo:
            for linha in linhas:
                atributo = linha.strip().split('-')
                contato = atributo[0]

                if contato != nome:
                    arquivo.write(linha)
                else:
                    existeContato = True
                    novo_atributo = atributo[1].replace('[', '').replace(']', '').replace(' ', '').replace("'",'').split(',')
                    editado = f'{novo}-{novo_atributo}\n'
                    arquivo.write(editado)

                    print('Nome editado!')
            if not existeContato:
                print('Contato não encontrado!')
    else:
        print('Agenda Vazia')

fnome = input('Digite o nome: ')
fnovoNome = input('Digite o novo nome: ')
editarTelefone(fnome, fnovoNome)

