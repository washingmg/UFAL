import os

def removerContato(nome):
    if os.path.exists(caminho):
        existeContato = False
        with open(caminho) as arquivos:
            linhas = arquivos.readlines
        with open(caminho,'w') as arquivo:
            for linha in linhas:
                atributo = linha.strip().split('-')
                contato = atributo[0]
                if contato != nome: #vai escrever os diferentes dele
                    arquivo.write(linha)
                else:
                    existeContato = True
                    print('Contato removido!')
            if not existeContato:
                print('Contato não encontrado')
    else:
        print('Agenda vazia!')

caminho = r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\agendaTelefone\agenda.txt'

remov_nome = input('Digite o nome do contato a ser removido!  ')
removerContato(remov_nome)














caminho = r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\agendaTelefone\agenda.txt'