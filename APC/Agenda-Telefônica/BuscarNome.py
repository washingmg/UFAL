import os

def buscarContato(nome):
    if os.path.exists(caminho):
        existeContato = False
        with open(caminho) as arquivo:
            linhas = arquivo.readlines()
            for linha in linhas:
                atributo = linha.strip().split('-')
                contato = atributo[0]
                telefone = atributo[1]
                if contato == nome:
                    print(nome,telefone)
                    existeContato = True
            if not existeContato:
                print('Contato não encontrado')
    else:
        print('Agenda Vazia')



caminho = r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\agendaTelefone\agenda.txt'
buscar_contato = input('Digite o contato a ser verificado:  ')
buscarContato(buscar_contato)