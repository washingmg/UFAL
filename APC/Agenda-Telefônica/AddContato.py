import os

def adicionarContato(nome,telefone):
    existeContato = False
    if os.path.exists(caminho):
        with open(caminho) as arquivo:
            for linhas in arquivo:
                if nome in linhas:
                    existeContato = True
                    break
            if existeContato:
                print('Esse contato já existe. Tente de novo!')
            else:
                with open(caminho,'a') as arquivo:
                    arquivo.write(f'{nome}-[{telefone}]\n')
                    print('Contato adicioando')
    else:
        with open(caminho,'w') as arquivo:
            arquivo.write(f'{nome}-[{telefone}]\n')
            print('Contato adicioando')




caminho = r'C:\Users\wmede\Desktop\Wpy\Arquivos.py\agendaTelefone\agenda.txt'
add_nome = input('Digite o nome a ser adicionado:  ')
add_telefone = (input('Digite o telefone a ser adicionado:  '))

adicionarContato(add_nome,add_telefone)
    